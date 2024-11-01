package com.ssafy.Classik_Backend.domain.track.entity

import jakarta.persistence.ElementCollection
import jakarta.persistence.Embeddable

@Embeddable
class Haptic(
    @ElementCollection
    val time: List<Int> = listOf(),

    @ElementCollection
    val intensity: List<Int> = listOf()
)