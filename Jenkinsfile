pipeline {
    agent any
    environment {
        DOCKER_COMPOSE_PATH = "/home/ubuntu/S11P31A604/docker-compose.yml"
        BACKEND_JAR_PATH = "build/libs/Classik_Backend-0.0.1-SNAPSHOT.jar"
    }
    stages {
        stage('Clone Repository') {
            steps {
                // GitLab에서 소스 코드 가져오기
                checkout scm
            }
        }
        stage('Build Spring Boot') {
            steps {
                dir('Classik_Backend') {
                    // Gradle로 빌드
                    sh './gradlew build'
                }
            }
        }
        stage('Test Spring Boot') {
            steps {
                dir('Classik_Backend') {
                    // Gradle로 테스트 실행
                    sh './gradlew test'
                }
            }
        }
        stage('Deploy with Docker Compose') {
            steps {
                // 기존 컨테이너 종료 및 새 컨테이너 실행
                sh '''
                docker-compose -f $DOCKER_COMPOSE_PATH down
                docker-compose -f $DOCKER_COMPOSE_PATH up -d
                '''
            }
        }
        stage('Health Check') {
            steps {
                script {
                    // Spring Boot 애플리케이션 상태 확인
                    def response = sh(script: "curl -I -o /dev/null -s -w '%{http_code}' http://k11a604.p.ssafy.io:8080/actuator/health", returnStdout: true).trim()
                    if (response != "200") {
                        error "Health check failed. HTTP status: ${response}"
                    }
                }
            }
        }
    }
    post {
        always {
            echo 'Pipeline execution completed.'
        }
        success {
            echo 'Pipeline succeeded. Application is running successfully.'
        }
        failure {
            echo 'Pipeline failed. Check the logs for errors.'
        }
    }
}
