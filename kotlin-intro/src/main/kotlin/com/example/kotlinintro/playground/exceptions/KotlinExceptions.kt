package com.example.kotlinintro.playground.exceptions

import java.lang.Exception

fun main() {

    println("name length is ${nameLength(null)}")
}

fun nameLength(name: String?) : Int? {
   return try {
        name!!.length
    } catch (ex : Exception ) {
        null
    }
}