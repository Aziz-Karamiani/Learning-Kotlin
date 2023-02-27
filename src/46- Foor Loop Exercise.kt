package main

fun main(args: Array<String>) {
    for (i in 1..10) {
        print(i)
        print(", ")
    }

    println()

    for (i in 10 downTo 1) {
        print(i)
        print(", ")
    }

    println()

    for (i in 1..10 step 2) {
        print(i)
        print(", ")
    }

    println()

    for (i in 10 downTo 1 step 2) {
        print(i)
        print(", ")
    }
}