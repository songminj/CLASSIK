package com.ssafy.Classik_Backend.domain.User

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    var username: String? = null
    var password: String? = null
    var nickname: String? = null
    var role: String? = null
}
