package com.quwisoft.restservice.config

import com.quwisoft.restservice.core.repository.api.UserRepository
import com.quwisoft.restservice.core.usecase.api.ProcessUser
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApiConf {

    @Bean
    fun processGetUserByName(
        userRepository: UserRepository
    ): ProcessUser = ProcessUser(userRepository)
}