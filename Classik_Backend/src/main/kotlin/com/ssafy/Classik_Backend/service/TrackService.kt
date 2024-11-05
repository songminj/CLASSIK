package com.ssafy.Classik_Backend.service

import com.ssafy.Classik_Backend.dto.TrackResponseDto
import com.ssafy.Classik_Backend.entity.Track

interface TrackService {

    fun getTrack(id: Long): TrackResponseDto
    fun searchTracks(word: String): List<Track>

}