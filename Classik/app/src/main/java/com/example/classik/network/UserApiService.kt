package com.example.classik.network

import retrofit2.Call
import retrofit2.http.GET

interface UserApiService {
    @GET("/")
    fun getTest(): Call<String>
}