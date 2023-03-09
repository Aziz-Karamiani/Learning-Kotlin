package main

fun main(args: Array<String>) {
    /*
        Create a class Math. It has four functions:
           - Add - takes two parameters and returns the sum
           - Sub - takes two parameters and returns the difference
           - Mul - takes two parameters and returns the multiplication
           - Div - takes two parameters and returns the division
        Create an object of that class and try out its methods
     */
    val number1 = 12
    val number2 = 5
    val math = Math()
    println("$number1 + $number2 = ${math.add(number1, number2)}")
    println("$number1 - $number2 = ${math.sub(number1, number2)}")
    println("$number1 * $number2 = ${math.mul(number1, number2)}")
    println("$number1 / $number2 = ${math.div(number1, number2)}")
    println("$number1 % $number2 = ${math.mod(number1, number2)}")
}

class Math {
    fun add(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    fun sub(number1: Int, number2: Int): Int {
        return number1 - number2
    }

    fun mul(number1: Int, number2: Int): Int {
        return number1 * number2
    }

    fun div(number1: Int, number2: Int): Int {
        return number1 / number2
    }

    fun mod(number1: Int, number2: Int): Int {
        return number1 % number2
    }
}