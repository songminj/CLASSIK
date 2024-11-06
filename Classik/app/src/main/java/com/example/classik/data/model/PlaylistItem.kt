package com.example.classik.data.model

data class PlaylistItem(
    override val trackId: Int,
    override val videoId: String,
    override val title: String,
    override val composer: String,
    override val thumbnailUrl: String
) : BaseTrack(trackId, videoId, title, composer, thumbnailUrl)