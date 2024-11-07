package com.example.classik.data.model

data class MusicCardData(
    val trackId: Int,
    val videoId: String,
    val title: String,
    val composer: String,
    val thumbnailUrl: String,
    val tags: List<Tags>
)
