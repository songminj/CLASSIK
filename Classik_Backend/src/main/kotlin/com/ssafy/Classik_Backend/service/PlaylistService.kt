package com.ssafy.Classik_Backend.service

import com.ssafy.Classik_Backend.dto.PlaylistCreateRequestDto
import com.ssafy.Classik_Backend.dto.PlaylistCreateResponseDto

interface PlaylistService {

    fun createPlaylist(userId: Int, requestDto: PlaylistCreateRequestDto): PlaylistCreateResponseDto

}