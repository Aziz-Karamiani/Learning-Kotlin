fun main(args: Array<String>) {
    Book1.printMe()
}

class Book1 {
    companion object {}
}

fun Book1.Companion.printMe() {
    println("Book has been printed")
}