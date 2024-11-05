package com.example.classik.data

data class Playlist (
    val id: Int,
    val title: String,
    val trackCount: Number,
    val thumbnails: List<Thumbnails>
)

data class Thumbnails (
    val thumbnailUrl: String
)