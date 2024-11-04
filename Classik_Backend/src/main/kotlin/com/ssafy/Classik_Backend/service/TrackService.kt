package com.ssafy.Classik_Backend.service

import com.ssafy.Classik_Backend.domain.track.dto.TrackDto
import com.ssafy.Classik_Backend.domain.track.entity.Track

interface TrackService {

    fun getTrack(id: Long): TrackDto
    fun searchTracks(word: String): List<Track>

}