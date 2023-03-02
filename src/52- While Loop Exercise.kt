package main

fun main(args: Array<String>) {
    var isFinished = true
    while (isFinished) {
        println("Please Enter A Number Greater Than 100: ")
        val userInput = readLine() ?: "0"
        val number = userInput.toInt()
        if (number > 100) {
            println("Yes your number is greater than 100")
            isFinished = false
        }
    }

    println("Done.")
}