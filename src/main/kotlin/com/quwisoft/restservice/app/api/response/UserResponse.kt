package com.quwisoft.restservice.app.api.response

import com.quwisoft.restservice.core.model.User

data class UserResponse(

    var id: Int,
    var name: String,
    var uniqueName: String,
    var email: String
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
