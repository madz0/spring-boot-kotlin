package com.github.madz0.repository

import com.github.madz0.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long>