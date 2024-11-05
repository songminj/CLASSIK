package com.example.classik.ui.viewmodel

import com.example.classik.data.model.PlaylistItem

interface PlaylistViewModelInterface {
    val playlist: List<PlaylistItem>
    val itemCount: Int

    fun addPlaylistItem(item: PlaylistItem)
    fun deletePlaylistItems(items: List<PlaylistItem>)
}
