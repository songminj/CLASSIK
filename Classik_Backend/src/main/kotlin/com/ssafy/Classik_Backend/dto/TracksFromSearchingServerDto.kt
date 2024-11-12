package com.ssafy.Classik_Backend.dto

data class TracksFromSearchingServerDto(
    val item: ArrayList<SearchedTrack> = ArrayList<SearchedTrack>()
)

data class SearchedTrack(
    val composer: String = "",
    val tags: String = "",
    val title: String = "",
)
