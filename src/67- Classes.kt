package main

fun main(args: Array<String>) {
    /*
    Create a class called Animal. It has a variable topSpeed and a function run() that prints
      out a message which states the animal’s top speed.
        - Create an object from that class, and run the function.
        - Update the variable and run the function again.
     */

    val tiger = Animal()
    tiger.run()
    tiger.name = "Tiger"
    tiger.topSpeed = 150
    tiger.run()

    val rabbit = Animal()
    rabbit.name = "Rabbit"
    rabbit.topSpeed = 200
    rabbit.run()
}

class Animal {
    var name: String = "Animal";
    var topSpeed: Int = 0;

    fun run() {
        println("$name's top speed is $topSpeed")
    }
}