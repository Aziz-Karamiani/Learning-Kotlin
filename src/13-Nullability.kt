package main

fun main(args: Array<String>) {
    val myName: String = "Aziz Karamiani"
    println(myName)
    println(myName.length)

    val catName: String? = null
    println(catName)
    println(catName?.length)

    val amount: Int? = 10
    println(amount?.plus(10))
    println(amount?.minus(5))
    println(amount?.times(10))
    println(amount?.div(2))
    println(amount?.rem(3))

    // Practices
    /*
    Number1:
        Declare a nullable variable of type String and give it a value.
        Print out a substring of it, from position 3 to 6
    */
    val greaterThan: String? = "Greeting"
    println(greaterThan?.substring(3,6))

    /*
    Number2:
        Declare a nullable variable of type Double.
        Multiply it by 6, convert it to a Float and print it to the console
     */
    var d: Double? = 3.14
    d = d?.times(6)
    val f: Float = d?.toFloat() ?: 0F
    println(f)

    /*
    Number3:
        Receive the name of the user from the console.
        Print out the length of the name.
     */
    println("What is your name?")
    var firstName: String? = null
    firstName = readLine()
    println(firstName?.length)
}
