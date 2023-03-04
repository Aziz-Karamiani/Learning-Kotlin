package main

fun main(args: Array<String>) {
    println(sum(1, 2, 3, 4, 5))
    println(sum(10, 20, 30, 40, 50))
    println(sum(100, 200, 300, 400, 500))
}

fun sum(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}