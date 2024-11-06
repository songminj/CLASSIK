package com.ssafy.Classik_Backend.service

import com.ssafy.Classik_Backend.dto.*

interface PlaylistService {

    fun getPlaylist(playlistId: Int): PlaylistResponseDto
    fun getPlaylists(userId: Int): List<PlaylistResponseDto>
    fun createPlaylist(userId: Int, requestDto: PlaylistCreateRequestDto): PlaylistCreateResponseDto
    fun updatePlaylist(playlistId: Int, requestDto: PlaylistUpdateRequestDto): PlaylistResponseDto

}