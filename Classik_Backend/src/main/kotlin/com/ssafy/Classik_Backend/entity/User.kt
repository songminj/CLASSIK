package com.ssafy.Classik_Backend.entity

import jakarta.persistence.*

@Entity
class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    var id: Int = 0

    var username: String? = null
    var password: String? = null
    var nickname: String? = null
    var role: String? = null

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    val playlists: MutableList<Playlist> = mutableListOf()
}
