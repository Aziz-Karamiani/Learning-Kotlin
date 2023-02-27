package main

fun main(args: Array<String>) {
    var sumAll = 0
    var sumOdd = 0
    var sumEven = 0

    for(i in 1..100) {
        sumAll += i
        if(i%2 == 0)
            sumEven += i
        else
            sumOdd += i
    }

    println("Sum of all numbers between 1..100 is : $sumAll")
    println("Sum of all Odd numbers between 1..100 is : $sumOdd")
    println("Sum of all Even numbers between 1..100 is : $sumEven")

}