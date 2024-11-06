package com.example.classik.data.model

data class Playlist (
    val playlistId: Int,
    val title: String,
    val trackCount: Number,
    val thumbnails: List<Thumbnails>
)

data class Thumbnails (
    val thumbnailUrl: String
)