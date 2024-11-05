package com.ssafy.Classik_Backend.entity

import jakarta.persistence.*

@Entity
class Composer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "composer_id", nullable = false)
    val id: Int,

    val name: String,
    val description: String,

    @OneToMany(mappedBy = "composer", cascade = [CascadeType.ALL], orphanRemoval = true)
    val tracks: MutableSet<Track> = mutableSetOf(),
)