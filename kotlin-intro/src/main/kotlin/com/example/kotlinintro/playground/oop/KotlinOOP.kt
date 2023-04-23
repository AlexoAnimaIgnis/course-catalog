package com.example.kotlinintro.playground.oop

fun main() {

    val p1 = Person()
    p1.action()
    val p2 = PersonPrimary("Alexo")
    p2.action()


    val p3 = PersonSecondary("Alex")
    p3.action()
}

class Person {
    fun action() {
        println("Walking...")
    }
}

class PersonPrimary(
    private val name: String
) {
    fun action() {
        println("$name is alking...")
    }
}

class PersonSecondary() {
    var name: String = ""


    init {
        println("Inside init block")
    }

    constructor(name: String): this() {
        this.name = name
    }


    fun action() {
        println("$name is singing...")
    }

}