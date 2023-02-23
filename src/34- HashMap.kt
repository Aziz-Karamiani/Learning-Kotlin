package main

fun main(args: Array<String>) {
    val numbers = hashMapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println(numbers)

    numbers.put(4, "Four")
    println(numbers)

    val newNumbers = hashMapOf(Pair(5, "Five"), Pair(6, "Six"))
    numbers.putAll(newNumbers)
    println(numbers)

    numbers.remove(5)
    println(numbers)

    numbers.replace(4, "4")
    println(numbers)

    numbers.clear()
    println(numbers)
}