package main

fun main(args: Array<String>) {
    /*
        Create a list of your favourite animals.
        Print out how many animals you have in your list.
        Print out the second element in that list.
     */
    val myFavoriteAnimalLists = listOf("Cow", "Sheep", "Dog", "Lion", "Tiger")
    println(myFavoriteAnimalLists)
    println(myFavoriteAnimalLists.size)
    println(myFavoriteAnimalLists.get(index = 1))
}