package com.ssafy.Classik_Backend.repository

import com.ssafy.Classik_Backend.entity.Playlist
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface PlaylistRepository : JpaRepository<Playlist, Int> {

    @Query("SELECT p.title FROM Playlist p WHERE p.id = :id")
    fun findTitleById(@Param("id") id: Int): String?

}