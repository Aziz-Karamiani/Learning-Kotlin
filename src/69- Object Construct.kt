package main

fun main(args: Array<String>) {
    println("Do you want to connect to database? (false/true)")
    val userInput = readLine() ?: "true"
    val connectionStatus: Boolean = userInput.toBoolean()
    if (connectionStatus) {
        DatabaseConnection.connect()
    } else {
        DatabaseConnection.disconnect()
    }
}

object DatabaseConnection {
    var connected: Boolean = false

    fun connect() {
        connected = true
        println("Connect to database...")
    }

    fun disconnect() {
        connected = false
        println("Disconnect from database...")
    }
}