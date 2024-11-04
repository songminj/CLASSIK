package com.ssafy.Classik_Backend.domain.track.entity

import jakarta.persistence.*

@Entity
class Track(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val title: String,
    val composer: String,
    val tags: String,

    @Column(name = "video_id")
    val videoId: String,
    @Column(name = "image_url")
    val imageUrl: String,
    @Column(name = "haptic_time")
    val hapticTime: String,
    @Column(name = "haptic_intensity")
    val hapticIntensity: String,
)