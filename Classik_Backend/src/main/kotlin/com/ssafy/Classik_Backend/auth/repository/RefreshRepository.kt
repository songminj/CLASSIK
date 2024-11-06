package com.ssafy.Classik_Backend.auth.repository

import com.ssafy.Classik_Backend.auth.entity.RefreshToken
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository

interface RefreshRepository : JpaRepository<RefreshToken, Long> {
    fun existsByRefresh(refresh: String): Boolean

    @Transactional
    fun deleteByRefresh(refresh: String)
}
