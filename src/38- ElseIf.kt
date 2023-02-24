package main

fun main(args: Array<String>) {
    println("What Is Your Favourite Animal?")
    val animal = readLine().toString()
    val action = if ( animal == "dog" ) {
        "pet it"
    } else if (animal == "cat") {
        "feed it"
    } else if (animal == "crocodile") {
        "run away"
    } else {
        "google it"
    }

    println(action)
}