package com.example.classik.viewmodel

import com.example.classik.data.model.Playlist

interface PlaylistViewModelInterface {
    val playlists: List<Playlist>
    val itemCount: Int
    fun fetchAllPlaylists(userId: Int)
}
