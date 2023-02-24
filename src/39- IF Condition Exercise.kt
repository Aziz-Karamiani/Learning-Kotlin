package main

fun main(args: Array<String>) {
    /*
    You receive a message from a remote server. You have this message code in a variable.
        If the message starts with 1		-> 	print “Information response”
        If the message starts with 2 	-> 	print “Success”
        If the message starts with 3 	->	print “Redirect”
        If the message starts with 4		->	print “Client error”
        If the message starts with 5		-> 	print “Server error”
     */
    val response = readLine() ?: "500"
    val message = if (response.startsWith("1"))
        "Information response"
    else if (response.startsWith("2"))
        "Success"
    else if (response.startsWith("3"))
        "Redirect"
    else if (response.startsWith("4"))
        "Client Error"
    else
        "Server Error"

    println(message)
}