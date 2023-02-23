package main

fun main(args: Array<String>) {
    val numbers = mapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"), Pair(4, "Four"), Pair(5, "Five"))
    println(numbers)
    println(numbers.size)

    println(numbers.get(key = 1))
    println(numbers.get(key = 2))

    val numbers2 = mapOf<Int, String>()
    println(numbers2)
}