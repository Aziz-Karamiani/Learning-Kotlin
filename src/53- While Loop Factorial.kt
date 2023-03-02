package main

fun main(args: Array<String>) {
    /*
Ask the user to input an integer.
    Calculate the factorial of that integer.
    * The factorial of a number n is
        1 * 2 * 3 * … * n
 */
    println("Please enter a number to calculate factorial: ")
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