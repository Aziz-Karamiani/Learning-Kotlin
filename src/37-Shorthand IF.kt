package main

fun main(args: Array<String>) {
    println("What Is The Current Status Of Campaign? (true/false)")
    val userInput = readLine()?:"false"
    val isActive = userInput.toBoolean()
    val isRunning = if (isActive) "Yes Is Running" else "No..."
    println(isRunning)
}