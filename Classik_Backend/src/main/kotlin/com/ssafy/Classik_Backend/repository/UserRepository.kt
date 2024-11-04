package com.ssafy.Classik_Backend.repository

import com.ssafy.Classik_Backend.domain.User.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int> {
    fun existsByUsername(username: String): Boolean

    // username을 받아 DB 테이블에서 회원 조회하는 메서드
    fun findByUsername(username: String): User?
}
