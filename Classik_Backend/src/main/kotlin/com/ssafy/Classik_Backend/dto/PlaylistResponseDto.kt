package com.ssafy.Classik_Backend.dto

class PlaylistResponseDto(
    val title: String,
) {
    val tracks: MutableList<TrackResponseDto> = mutableListOf()

    fun addTrack(toDto: TrackResponseDto) {
        tracks.add(toDto)
    }
}