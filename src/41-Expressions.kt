package main

fun main(args: Array<String>) {
    /*
        Ask a user to input their age.
        If they are under 13, they are a child
        If they are under 18, they are a teen
        If they are older, they are an adult.
        Use ranges to print out the correct message.
        If the age is 0, convert it to 1.
     */
    println("Please Enter Your Age?")
    val userInput = readLine() ?: "0"
    var age = userInput.toInt()

    if (age == 0)
        age = 1

    val message = if (age in 1..13)
        "Child"
    else if (age in 13..18)
        "Teen"
    else
        "Adult"

    println(message)
}