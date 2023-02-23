package main

fun main(args: Array<String>) {
    val numbers = hashSetOf(1, 5, 10, 15, 20)
    println(numbers)
    println(numbers.size)

    val numbers2 = hashSetOf(1, 5, 10)
    numbers.retainAll(numbers2)
    println(numbers)
    println(numbers.size)

    numbers.clear()
    println(numbers)
    println(numbers.size)
}