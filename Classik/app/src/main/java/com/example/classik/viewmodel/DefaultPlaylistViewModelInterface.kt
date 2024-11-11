package com.example.classik.viewmodel

import com.example.classik.data.model.PlaylistItem

interface DefaultPlaylistViewModelInterface {
    val playlist: List<PlaylistItem>
    val itemCount: Int

    fun addPlaylistItem(item: PlaylistItem)
    fun deletePlaylistItems(items: List<PlaylistItem>)
}
