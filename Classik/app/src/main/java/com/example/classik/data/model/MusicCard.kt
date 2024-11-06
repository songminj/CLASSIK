package com.example.classik.data.model

data class MusicCardData(
    override val trackId: Int,
    override val videoId: String,
    override val title: String,
    override val composer: String,
    override val thumbnailUrl: String,
    val tags: List<Tags>
) : BaseTrack(trackId, videoId, title, composer, thumbnailUrl)
