package com.ssafy.Classik_Backend.service

import com.ssafy.Classik_Backend.domain.track.dto.TrackResponseDto
import com.ssafy.Classik_Backend.domain.track.entity.Track

interface TrackService {

    fun getTrack(id: Long): TrackResponseDto
    fun searchTracks(word: String): List<Track>

}