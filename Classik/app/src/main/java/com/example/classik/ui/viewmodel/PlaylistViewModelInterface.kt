package com.example.classik.ui.viewmodel

import com.example.classik.data.model.Playlist

interface PlaylistViewModelInterface {
    val playlists: List<Playlist>
    val itemCount: Int
    fun fetchAllPlaylists(userId: Int)
}
