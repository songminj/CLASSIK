package com.ssafy.Classik_Backend.dto

data class PlaylistResponseDto(
    val title: String,
    val tracks: MutableList<TrackDetailResponseDto>,
)