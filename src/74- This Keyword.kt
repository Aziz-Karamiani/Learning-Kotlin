package main

fun main(args: Array<String>) {
//    A box has a contents variable as a String, and a function updateContents that also takes a contents variable.
//    Create a program that updates the class variable in the updateContents function.
    val printer = Printer()
    printer.printMessage()

    printer.updateMessage("Updated Message")
    printer.printMessage()
}

class Printer {
    var message: String = "Initial Message"

    fun updateMessage(message: String) {
        this.message = message
    }

    fun printMessage() {
        println(message)
    }
}