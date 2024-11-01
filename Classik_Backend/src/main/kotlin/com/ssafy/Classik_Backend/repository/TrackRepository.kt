package com.ssafy.Classik_Backend.repository

import com.ssafy.Classik_Backend.domain.track.entity.Track
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TrackRepository : JpaRepository<Track, Long> {

    fun findByTitle(title: String): Track?
    fun findByComposer(title: String): Track?

}