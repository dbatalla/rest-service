package com.quwisoft.restservice.core.repository.api

import com.quwisoft.restservice.core.model.User

interface UserRepository {

    fun execute(uniqueName: String): User?

    fun execute(): List<User>

    fun save(user: User): User?
}