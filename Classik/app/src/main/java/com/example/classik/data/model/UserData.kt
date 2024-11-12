package com.example.classik.data.model

data class UserData(
    val accessToken: String,
    val refreshToken: String,
    val userInfo: UserInfo
)

data class UserInfo(
    val memberId: Int,
    val email: String,
    val nickname: String,
    val profileUrl: String,
    val role: String
)