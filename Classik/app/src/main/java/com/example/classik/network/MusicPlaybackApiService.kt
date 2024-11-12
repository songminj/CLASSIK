package com.example.classik.network

import com.example.classik.data.model.MusicDetail
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MusicPlaybackApiService {
    @GET("tracks/{trackId}")
    fun getMusicDetail(@Path("trackId") trackId: Int): Call<MusicDetail>
}