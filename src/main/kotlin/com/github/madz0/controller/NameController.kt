package com.github.madz0.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/")
class NameController {
    @RequestMapping("")
    @ResponseBody
    fun getName(): String {
        return "testName"
    }
}