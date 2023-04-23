package com.example.kotlinintro.playground.exceptions

import com.kotlinplayground.classes.Course
import com.kotlinplayground.classes.CourseCategory

fun main() {

    //exploreApplyAlso()
//    exploreLet()

//    exploreWith() // these are not extension functions
    exploreRun()
}

fun exploreRun() {
    var numbers : MutableList<Int>? = null
    val result = numbers.run {
        numbers = mutableListOf(1, 2, 3, 4, 5)
        numbers?.sum()
    }
    println("result is $result")

    val length = run {
        val name = "alexo ballester"
        println(name)
        name.length
    }

    println("result length is $length")
}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    var result = with(numbers) {
        println("Sizes: ${numbers.size}")
        println("Sizes: $size")
        val list = plus(6)
        list.sum()
    }

    println("Result is : $result")

}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it * 2 }.filter { it > 5 }
        .let { // Executing a lambda on non-null objects
        println(it)
        it.sum()
    }
    println(result)
}

fun exploreApplyAlso() {
    Course(
        1,
        "Reactive Programming",
        "alexo"
    ).apply { // used for configuring an object. uses `this`
        courseCategory = CourseCategory.DESIGN
    }.also { // used for additional effects that needs to be done
        println(it)
    }
}