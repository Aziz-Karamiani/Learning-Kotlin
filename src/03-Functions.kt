package main

fun main() {
    println("Start Using Functions in Kotlin...");
    // Builtin functions
    println(listOf(1,2,3,4,5,6,7,8,9).joinToString(separator = "", prefix = "(", postfix = ")"));

    // Our function
    displayChars();
    displayChars('&');
    displayChars(number = 10);
    displayChars(char = '@');
    displayChars('*', 5);

    println("End Using Functions in Kotlin...");
}

fun displayChars(char: Char = '_', number: Int = 5):Unit {
    repeat(number) {
        print(char);
    }
    println();
}