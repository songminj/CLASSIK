package com.ssafy.Classik_Backend.entity

import jakarta.persistence.*

@Entity
class PlaylistTrack(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playlist_id", nullable = false)
    val playlist: Playlist,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "track_id", nullable = false)
    val track: Track
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playlist_track_id")
    val id: Int? = null
}