package main

import kotlin.random.Random

const val numberOfGuess = 6
var currentNumberOfWrongGuess = 0
val words = listOf("Tiger", "Dog", "Cat", "Donkey", "Elephant", "Giraffe", "Camel", "Zebra", "Rabbit", "Snake", "Cow")

fun main(args: Array<String>) {
    println(words)
    val word = words[Random.nextInt(words.size) - 1]
    println(guessWord(word))
    println("Start the game...")
    while (currentNumberOfWrongGuess < numberOfGuess) {
        val ch = typeALetter()
        var isOk = false
        for (i in word.indices) {
            if (ch == word[i])
                isOk = true
        }

        if (!isOk) {
            currentNumberOfWrongGuess++
        }
    }
}

fun typeALetter(): Char {
    return readLine()!!.single()
}

fun guessWord(word: String): String {
    var str = ""
    for (i in word.indices) {
        str += "_ "
    }
    return str
}

fun validateResponse() {
    when (currentNumberOfWrongGuess) {
        0 -> print0MistakeGuess()
        1 -> print1MistakeGuess()
        2 -> print2MistakeGuess()
        3 -> print3MistakeGuess()
        4 -> print4MistakeGuess()
        5 -> print5MistakeGuess()
        6 -> print6MistakeGuess()
    }
}

fun print0MistakeGuess() {
    println(" -|-----------|")
    println("  |")
    println("  |")
    println("  |")
    println("  |")
    println("  |")
    baseline()
}

fun print1MistakeGuess() {
    println(" -|-----------|")
    println("  |           |")
    println("  |")
    println("  |")
    println("  |")
    baseline()
}

fun print2MistakeGuess() {
    println(" -|-----------|")
    println("  |           |")
    println("  |           O")
    println("  |")
    println("  |")
    println("  |")
    baseline()
}

fun print3MistakeGuess() {
    println(" -|-----------|")
    println("  |           |")
    println("  |           O")
    println("  |           |")
    println("  |")
    println("  |")
    baseline()
}

fun print4MistakeGuess() {
    println(" -|-----------|")
    println("  |           |")
    println("  |           O")
    println("  |           |")
    println("  |          /|\\")
    println("  |")
    baseline()
}

fun print5MistakeGuess() {
    println(" -|-----------|")
    println("  |           |")
    println("  |           O")
    println("  |           |")
    println("  |          /|\\")
    println("  |           |")
    baseline()
}


fun print6MistakeGuess() {
    println(" -|-----------|")
    println("  |           |")
    println("  |           O")
    println("  |           |")
    println("  |          /|\\")
    println("  |           |")
    println("  |          / \\")
    baseline()
}

fun baseline() {
    println("  |")
    println(" /|\\")
    println("//|\\\\")
    println("------------------------")
}