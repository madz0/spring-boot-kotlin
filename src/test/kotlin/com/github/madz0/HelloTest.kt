package com.github.madz0

import com.github.madz0.sample.TestClass
import com.github.madz0.sample.TestClass2
import com.github.madz0.sample.getNameWithPostfix
import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun testTestClassFunc1() {
        TestClass.func1
    }

    @Test
    fun testTestClass2Func1() {
        val testClass2 = TestClass2("madz")
        assertEquals("prfx_madz", testClass2.getnameWithPrefix(), "Ha?")
    }

    @Test
    fun testTestClass2GetNameWithPostfix() {
        val testClass2 = TestClass2("madz")
        assertEquals("madz_postfix", testClass2.getNameWithPostfix())
    }

    @Test fun testTestClass2FunWithFunParameter() {
        val testClass2 = TestClass2("madz")
        val arr = arrayOf(1,2,3)
        testClass2.funWithFunParameter(arr) { v->v*2}
        assertEquals(2, arr[0])
    }
}
