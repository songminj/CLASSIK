package com.ssafy.Classik_Backend.repository

import com.ssafy.Classik_Backend.domain.track.entity.Composer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ComposerRepository : JpaRepository<Composer, Long> {
}