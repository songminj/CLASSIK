package com.example.classik.data.model

data class RecommendList (
    val recommendTitle: String,
    val recommendImageUrl: String,
    val recommendTracks: List<RecommendItem>,
)

data class RecommendItem (
    val trackId: Int,
    val title: String,
    val composer: String,
    val thumbnailUrl: String,
    val tags: List<String>
)