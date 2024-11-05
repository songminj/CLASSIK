package com.example.classik.viewmodel

import com.example.classik.data.PlaylistItem

interface PlaylistViewModelInterface {
    val playlist: List<PlaylistItem>
    val itemCount: Int

    fun addPlaylistItem(item: PlaylistItem)
    fun deletePlaylistItems(items: List<PlaylistItem>)
}
