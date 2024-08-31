package com.example.kotlinbaslangic

class Variable {
    init {
        var name = "mustafa UYAR"
        println(square(7))
    }
    private fun square(number: Int) = number * number
}

fun main(){
   Variable()
}