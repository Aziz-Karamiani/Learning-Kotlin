package main

fun main(args: Array<String>) {
    // Print length of str
    val str = "My cat’s name is \"Fluffy\""
    println(str.length)

    // Extract car from string
    val str2 = "My car won’t start"
    println(str2.substring(3, 7))

    val clientName = "John"
    println("Hello, $clientName")

    val number1 = 12
    val number2 = 13
    println("12 + 13 = ${number1 + number2}")
}