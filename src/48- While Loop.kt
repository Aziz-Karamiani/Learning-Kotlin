package main

fun main(args: Array<String>) {
    var i = 1
    val n = 100
    var sum = 0
    while (i <= n) {
        sum += i
        i++
    }
    println("Sum of 1 to $n is : $sum")
}