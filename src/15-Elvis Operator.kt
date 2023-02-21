package main

fun main(args: Array<String>) {
    var catName: String? = null
    println(catName)
    println(catName?:"Meow")
    println(catName?:"Meow".length)
    catName = "Tom"
    println(catName)
    println(catName?:"Meow")
    println(catName?:"Meow".length)
}