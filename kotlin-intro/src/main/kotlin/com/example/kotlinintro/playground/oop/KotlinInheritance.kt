package com.example.kotlinintro.playground.oop

fun main() {
    var user = Student("Alex")
    user.login()
}

open class User(val name: String) {
    open var isLoggedIn = false
    open fun login() {
        println("User logging in...")
    }
}

class Student(name: String): User(name) {

    override var isLoggedIn = false
    override fun login() {
        println("Student $name, logging in")
        super.login()
    }
}

class Instructor(name: String): User(name)