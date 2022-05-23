package com.quwisoft.restservice.app.client

import com.quwisoft.restservice.core.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface UserJpaRepository: JpaRepository<User, Long> {

    fun findByUniqueName(uniqueName: String): User?

}