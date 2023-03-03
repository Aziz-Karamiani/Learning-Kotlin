package main

fun main(args: Array<String>) {
    /*
        Create a function that receives the price of a product, adds 20% tax and returns the result.
        These are the products in your online store.
        val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))
        Print out the final price for each product.
     */
    val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99), Pair("", null))
    for (product in products.keys) {
        println("Price for $product is ${calculatePrice(products[product])}")
    }

}

fun calculatePrice(price: Double?) = price?.times(1.2)

