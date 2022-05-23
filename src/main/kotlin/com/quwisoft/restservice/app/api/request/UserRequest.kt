package com.quwisoft.restservice.app.api.request

import com.quwisoft.restservice.app.api.response.UserResponse
import com.quwisoft.restservice.core.model.User

data class UserRequest(
    val name: String? = null,
    val uniqueName: String? = null,
    val email: String? = null

) {

    companion object {
        fun buildFromEntity(user: User) = UserResponse(
            id = user.id,
            name = user.name,
            uniqueName = user.uniqueName,
            email = user.email
        )
    }
}
