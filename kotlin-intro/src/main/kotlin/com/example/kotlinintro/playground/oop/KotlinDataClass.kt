package com.example.kotlinintro.playground.oop

import java.lang.IllegalArgumentException

data class Course(
    val id: Int,
    val name: String,
    val author: String
)


class Item() {
    var name : String = ""
    var price : Double = 0.0
        get() {
            println("inside getter")
            return field
        }
        set(value) {
            println("inside setter")
            if(price >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException()
            }
        }
}

fun main() {
    val course: Course = Course(1, "course1", "alexo")
    val course2: Course = Course(1, "course2", "alexo")
    val course3: Course = course2.copy()
    println(course)
    println(course == course2)

    var item = Item()
    item.price = 100.0
    println(item.price)
}
