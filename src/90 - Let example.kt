package main

fun main(args: Array<String>) {
    /*
        Read a text from the console. If it’s not null, convert it to an Int, double it and print it to the console.
     */
    println("Input a number")
    val userInput = readLine()
    userInput?.let {
        val number = it.toInt()
        println("The double of your number is ${number * 2}")
    }

    /*
        Read 3 animals from the console and add them to a list. If you read an empty string, add a null to the list.
        For each animal in the list, print a ‘feeding the animal’ message.
     */
    val animals = arrayListOf<String?>()
    for (i in 1..3) {
        println("Input an animal")
        val input = readLine()
        input?.let {
            if (it == "") {
                animals.add(null)
            } else {
                animals.add(it)
            }
        }
    }

    animals.forEach {
        it?.let {
            println("Feeding the $it")
        }
    }
}