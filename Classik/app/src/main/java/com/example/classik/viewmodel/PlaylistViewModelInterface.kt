package com.example.classik.viewmodel

import com.example.classik.data.model.AllPlaylistItem

interface PlaylistViewModelInterface {
    val allPlaylistItems: List<AllPlaylistItem>
    val itemCount: Int
    fun fetchAllPlaylists(userId: Int)
}
