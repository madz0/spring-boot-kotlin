package com.github.madz0.controller

import com.github.madz0.model.User
import com.github.madz0.repository.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/user")
class UserController(var userRepository: UserRepository) {

    @RequestMapping("/list")
    @ResponseBody
    fun getOneUser():MutableList<User> {
        return userRepository.findAll()
    }
}