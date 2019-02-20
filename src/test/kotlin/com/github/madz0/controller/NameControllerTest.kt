package com.github.madz0.controller

import com.github.madz0.App
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [App::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NameControllerTest {

    @Autowired
    lateinit var testRestTemplate:TestRestTemplate

    @Test
    fun getName() {
        val result = testRestTemplate.getForEntity("/", String::class.java)
        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        assertEquals(result?.body, "testName")
    }
}