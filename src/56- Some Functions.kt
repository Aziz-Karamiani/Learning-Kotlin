package main

fun main(args: Array<String>) {
    for (i in 1..10) {
        println("$i + ${i + 1} = ${sum(i, i + 1)}")
    }
}

fun sum(number1: Int = 1, number2: Int = 2): Int {
    return number1 + number2
}