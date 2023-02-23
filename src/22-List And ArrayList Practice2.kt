package main

fun main(args: Array<String>) {
    /*
        Create an arrayList of online users for your website.
        add new logged in user to online lists.
        remove signed out user from online lists.
     */
    val onlineUsers = arrayListOf("Aziz", "Mina", "Reza")
    println(onlineUsers)
    println(onlineUsers.size)

    onlineUsers.add("Meysam")
    println(onlineUsers)
    println(onlineUsers.size)

    onlineUsers.add("Niki")
    println(onlineUsers)
    println(onlineUsers.size)

    onlineUsers.add("Amir")
    println(onlineUsers)
    println(onlineUsers.size)

    onlineUsers.remove("Niki")
    println(onlineUsers)
    println(onlineUsers.size)
}