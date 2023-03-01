package main

fun main(args: Array<String>) {
    /*
        You have 5 cats.
        var cats = listOf("Tiger", "Smokey", "Sassy", "Patch", "Sammy")
        Design a program that prints out a hello message for each cat, using a while loop.
     */
    val cats = listOf("Tiger", "Smokey", "Sassy", "Patch", "Sammy")
    var i = 0
    while (i <= cats.size - 1) {
        println("Greeting To ${cats[i]}")
        i++
    }

    /*
    Ask the user to input an integer.
        Calculate the factorial of that integer.
        * The factorial of a number n is
            1 * 2 * 3 * … * n
     */
    println("Please enter a number: ")
    val userInput = readLine()?: "1"
    val number = userInput.toInt()
    var factorial = 1
    var j = 1
    while (j <= number) {
        factorial *=j
       j++
    }

    println("Factorial for $number = $factorial")
}