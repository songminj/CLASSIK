package com.ssafy.Classik_Backend.domain.track.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Composer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "composer_id", nullable = false)
    val id: Int,
    val name: String,
    val description: String,
)