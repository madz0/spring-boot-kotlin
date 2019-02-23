package com.github.madz0.sample

class TestClass2(var name: String) {
    fun getnameWithPrefix() = "prfx_${name}"
    fun funWithFunParameter (numbers: Array<Int>, modifier: (input: Int) -> Int) {
        for ((i, value) in numbers.withIndex()) {
            numbers[i] = modifier(value)
        }
    }
}