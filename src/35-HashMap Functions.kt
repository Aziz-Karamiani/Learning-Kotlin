package main

fun main(args: Array<String>) {
    val numbers = hashMapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println(numbers)
    println(numbers.size)
    println(numbers.containsKey(2))
    println(numbers.containsKey(5))
    println(numbers.containsValue("Three"))
    println(numbers.containsValue("Five"))

    println(numbers.isEmpty())
    println(numbers.isNotEmpty())
    numbers.clear()
    println(numbers.isEmpty())
    println(numbers.isNotEmpty())
}