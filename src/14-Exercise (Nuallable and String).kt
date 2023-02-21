package main

fun main(args: Array<String>) {
    println("Please enter a number :")
    val number = readLine()?.toDouble()
    println("Your Number Multiply By 7 Is : ${number?.times(7)}")
    println("The result length is : ${number?.times(7).toString().length}")
}