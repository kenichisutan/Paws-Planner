package com.example.pawsplanner

class Pet(var name: String, var type: String, var age: String) {

    override fun toString(): String {
        return "$name\n$type\n$age\n"
    }
}