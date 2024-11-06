package com.example.classik.data.model

open class BaseTrack(
    open val trackId: Int,
    open val videoId: String,
    open val title: String,
    open val composer: String,
    open val thumbnailUrl: String
)