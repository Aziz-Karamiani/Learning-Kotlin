package main

fun main(args: Array<String>) {
    var i = 1
    var sum = 0
    do {
        sum += i
        i++
    } while (i <= 100)
    println("Sum of 1 to 100 : $sum")
}