package main

fun main(args: Array<String>) {
    /*
        Given a collection of random integers.
        If a number is odd, double it.
        If a number is even, half it.
        Print out a subset of the collection that has numbers greater than 25.
     */
    val numbers: Set<Int> = setOf(1, 2, 3, 4, 5, 31, 250, 25, 7, 1423, 365, 5050, 345, 999, 100000)
    println(numbers)
    val newNumbers = numbers.map { if (it % 2 == 0) it / 2 else it * 2 }.filter { it >= 25 }
    println(newNumbers)
}