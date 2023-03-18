fun main(args: Array<String>) {
    Double.printClassName()
    String.getClassType()
}

fun Double.Companion.printClassName() {
    println("This is a Double class")
}

fun String.Companion.getClassType() {
    println("This is a String class")
}