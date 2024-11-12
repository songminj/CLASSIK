package com.example.classik.network

import com.example.classik.data.model.RecommendList
import retrofit2.Call
import retrofit2.http.GET

interface HomeApiService {
    @GET("/recommends")
    fun getRecommends(): Call<List<RecommendList>>
}