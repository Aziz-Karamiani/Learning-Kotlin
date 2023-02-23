package main

fun main(args: Array<String>) {
    /*
        Create an hasSet of online users for your website.
        add new logged in user to online lists.
        remove signed out user from online lists.
     */
    val onlineUsers = hashSetOf("Aziz", "Meysam", "Matin")
    println("Online users $onlineUsers")

    onlineUsers.add("Mina")
    onlineUsers.add("Reza")
    println("Online users $onlineUsers")

    onlineUsers.remove("Meysam")
    println("Online users $onlineUsers")
}