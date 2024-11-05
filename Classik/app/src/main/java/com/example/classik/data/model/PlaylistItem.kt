package com.example.classik.data.model

data class PlaylistItem(
    val id: Int,
    val videoId: String,
    val title: String,
    val composer: String,
    val thumbnailUrl: String
//    val tags: List<Tags>
)

//data class Tags(
//    val type: String,
//    val content: String
//)