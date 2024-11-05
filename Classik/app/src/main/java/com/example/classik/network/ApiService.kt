package com.example.classik.network

import com.example.classik.data.model.Playlist
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    // 회원가입,로그인

    // 홈

    // 검색

    // 플레이리스트
    // 전체 조회
    @GET("{userId}/playlists")
    fun getAllPlaylists(@Path("userId") userId: Int): Call<List<Playlist>>


    // 최근 재생 기록

    // 음악 재생 페이지
}