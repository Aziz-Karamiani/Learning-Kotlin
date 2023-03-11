package main

fun main(args: Array<String>) {
    val restaurant1: Restaurant = LocalRestaurant()
    restaurant1.provideFood()
    restaurant1.provideBill()

    val restaurant2: Restaurant = FancyRestaurant()
    restaurant2.provideFood()
    restaurant2.provideBill()
}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant : Restaurant {
    override fun provideFood() {
        println("Local Restaurant Provide Food")
    }

    override fun provideBill() {
        println("You Must Pay 50$")
    }
}

class FancyRestaurant : Restaurant {
    override fun provideFood() {
        println("Fancy Restaurant Provide Food")
    }

    override fun provideBill() {
        println("You Must Pay 150$")
    }
}