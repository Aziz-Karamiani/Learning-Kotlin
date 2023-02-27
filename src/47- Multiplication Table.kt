package main

fun main(args: Array<String>) {
    println("Please Enter The Table Size:")
    val userInput = readLine() ?: "0"
    val tableSize = Integer.parseInt(userInput) + 1

    for (i in 1 until tableSize) {
        for (j in 1 until tableSize){
            print("${i * j} \t")
        }
        println()
    }
}