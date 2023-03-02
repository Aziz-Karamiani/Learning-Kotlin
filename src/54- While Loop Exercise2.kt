package main

fun main(args: Array<String>) {
    /*
        You have a set of usernames
        val usernames = hashSetOf(“john”, “bob”, “alice”)
        Ask the user to choose their username. If their username is taken, print out a message and ask again.
        Add the username to the set.
     */
    val usernames = hashSetOf("john", "bob", "alice")
    var isFinished = true
    while (isFinished) {
        println("Please Enter A User Name: ")
        val username = readLine() ?: ""
        if (username !in usernames) {
            isFinished = false
        } else {
            println("Username already taken..")
        }

    }
}