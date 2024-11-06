// MusicViewModel.kt
package com.example.classik.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.classik.ui.component.WebViewManager

class MusicViewModel : ViewModel() {
    fun initializeWebView(context: Context, videoId: String) = WebViewManager.initialize(context, videoId)
    fun play() = WebViewManager.playVideo()
    fun pause() = WebViewManager.pauseVideo()
    fun seekTo(time: Float) = WebViewManager.seekTo(time)
}
