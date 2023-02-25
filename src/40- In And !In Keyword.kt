package main

fun main(args: Array<String>) {
    val animals = listOf("Cat", "Dog", "Monkey", "Donkey")
    if ("Lion" in animals) println("Lion is in the animals list.") else println("Lion is not in animals list.")

    println(1 in 1..10)
    println(11 in 1..10)

    println(1 !in 1..10)
    println(11 !in 1..10)
}