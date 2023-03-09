package main

fun main(args: Array<String>) {
    // P1
    var a = 76.254
    var b = 3.867
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

//    A person goes to the market to buy some meat.
//    A kilo of meat costs 29.99.
//    The person wants to buy a third of a kilo.
//    How much does the person need to spend?
    val costPerKilo: Double = 29.99
    val amount: Double = 1.0/3
    println("Total Price is ${costPerKilo * amount}")

    println("--------------------------------------")

    println("Please Enter Your Amount In Bank Accounts?")
    val credit = readLine()?:""
//    val amountAfter5Year = (credit.toDouble() * (Math.pow(5.5/100, 5.0) - 1))/ (5.5/100 - 1)
//    println("Your Amount In Bank Accounts After 5 Years Is : $amountAfter5Year")
}