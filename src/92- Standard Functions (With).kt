package main

fun main(args: Array<String>) {
    with(Book()) {
        name = "PHP"
        numberOfPage = 300
        price = 300000
        read(30)
        info()
    }
}

class Book {
    var name: String = "C++"
    var numberOfPage: Int = 200
    var price: Int = 200000

    fun read(page: Int) {
        println("Read $page Page Per Hour.")
    }

    fun info() {
        println("Name: $name, Price: $price, Number of Page: $numberOfPage")
    }
}