package main

fun main(args: Array<String>) {
    println("What is your favourite programming language?")
    val userInput = readLine()
    println("Your favourite programming language is $userInput")

    println("Enter a number...")
    val yourNumber = readLine() ?: ""
    println("Your number multiply with 2 is :  ${yourNumber.toInt() * 2}")
}