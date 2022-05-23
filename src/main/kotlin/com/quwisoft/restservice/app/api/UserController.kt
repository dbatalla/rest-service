package com.quwisoft.restservice.app.api

import com.quwisoft.restservice.app.api.response.UserResponse
import com.quwisoft.restservice.core.model.User
import com.quwisoft.restservice.core.usecase.api.ProcessUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController(
    private val processUser: ProcessUser) {

    @GetMapping
    fun findAll() = processUser.execute()

    @GetMapping("/{uniqueName}")
    fun getUser(@PathVariable uniqueName: String) =
        processUser.execute(uniqueName)?.let { UserResponse.buildFromEntity(it) }
            ?: throw IllegalArgumentException("User with uniqueName $uniqueName not found")

    @PostMapping
    fun createUser(@RequestBody user: User) =
        processUser.save(user)?.let { UserResponse.buildFromEntity(it) }
            ?: throw IllegalStateException("User could not be saved")
}