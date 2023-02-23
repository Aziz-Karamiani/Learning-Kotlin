package main

fun main(args: Array<String>) {
    val numbers = hashSetOf(1, 2, 3, 4, 5)
    println(numbers)
    println(numbers.size)

    numbers.add(10)
    numbers.add(10)
    numbers.add(10)
    println(numbers)
    println(numbers.size)

    numbers.remove(10)
    println(numbers)
    println(numbers.size)

    val newNumbers = setOf(10, 11, 12, 15)
    numbers.addAll(newNumbers)
    println(numbers)
    println(numbers.size)

    val removedNumbers = setOf(11, 2, 5)
    numbers.removeAll(removedNumbers)
    println(numbers)
    println(numbers.size)
}