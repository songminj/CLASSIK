package com.ssafy.Classik_Backend.auth.util

import com.ssafy.Classik_Backend.auth.dto.CustomUserDetails
import org.springframework.security.core.context.SecurityContextHolder

fun getLoginMemberId(): Int {
    val authentication = SecurityContextHolder.getContext().authentication
    val userDetails = authentication.principal as CustomUserDetails
    return userDetails.getMemberId()
}