package com.example.kotlinintro.playground.exceptions

// note is available in IPHONE NOTES
fun main() {

    var nameNullable : String? = null

    nameNullable?.run {
        printName(this)
        println("Completed!")
    }
}

fun printName(str: String) {
    println(str)
}