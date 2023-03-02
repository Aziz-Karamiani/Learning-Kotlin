package main

fun main(args: Array<String>) {
    println("Please Enter The Table Size: ")
    val userTableSize = readLine() ?: "0"
    val tableSize = Integer.parseInt(userTableSize) + 1

    var i = 1
    var j = 1
    while (i < tableSize) {
        while (j < tableSize) {
            print("${i * j} \t")
            j++
        }
        println()
        i++
        j = 1
    }
}