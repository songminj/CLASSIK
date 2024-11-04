package com.ssafy.Classik_Backend.auth.repository

import com.ssafy.Classik_Backend.auth.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Int> {
    fun existsByUsername(username: String): Boolean

    // username을 받아 DB 테이블에서 회원 조회하는 메서드
    fun findByUsername(username: String): UserEntity?
}
