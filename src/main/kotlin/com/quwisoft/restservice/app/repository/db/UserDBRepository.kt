package com.quwisoft.restservice.app.repository.db

import com.quwisoft.restservice.app.client.UserJpaRepository
import com.quwisoft.restservice.core.model.User
import com.quwisoft.restservice.core.repository.api.UserRepository
import org.springframework.stereotype.Service

@Service
class UserDBRepository(
    private val userClient: UserJpaRepository
): UserRepository {
    override fun execute(uniqueName: String): User? {
        return try {
            userClient.findByUniqueName(uniqueName)
        } catch (ex: Exception) {
            null
        }
    }

    override fun execute(): List<User> {
        return try {
            userClient.findAll()
        } catch (ex: Exception) {
            emptyList()
        }
    }

    override fun save(user: User): User? {
        return try {
            userClient.save(user)
        } catch (ex: Exception) {
            null
        }
    }
}