package main

fun main(args: Array<String>) {
    /*
        You have a number of items on your desk.
        val items = arrayListOf(“laptop”, “mouse”, “pen”, “paper”, “mug”, “phone”)
        You clean up your desk and remove as many items as you can to be more productive.
        val removedItems = listOf(“pen”, “paper”, “mug”, “phone”)
        Print out the remaining items.
     */
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")
    println(items)
    println(removedItems)
    items.removeAll(removedItems)
    println(items)
}