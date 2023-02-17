package main

import main.Colors.*

fun main() {
    println(BLUE)
    println(ORANGE)
    println(RED)
    println(YELLOW)
    println(GREEN)

    println("-------------------")

    val a = 5
    val b = 15
    val max = if (a > b) a else b
    println("Max is : $max")

    println("-------------------")
    val c = when (BLUE) {
        GREEN -> "Green"
        ORANGE -> "Orange"
        RED -> "Red"
        YELLOW -> "Yellow"
        else -> "Blue"
    }

    println("Color is : $c")
}