package com.quwisoft.restservice.core.usecase.api

import com.quwisoft.restservice.core.model.User
import com.quwisoft.restservice.core.repository.api.UserRepository

class ProcessUser(
    private val userRepository: UserRepository
) {
    fun execute(uniqueName: String) = userRepository.execute(uniqueName)

    fun execute() = userRepository.execute()

    fun save(user: User): User? = userRepository.save(user)
}