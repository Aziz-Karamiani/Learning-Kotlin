package person

fun main(args: Array<String>) {
    /*
        A person class has a first name, last name and age, and a function that prints out all the information.
         Create an object of the person class and update its information and call the print function.
     */

    with(Person()) {
        firstName = "Aziz"
        lastName = "Karamiani"
        age = 32
        info()
    }
}

class Person {
    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 1

    fun info() {
        println("$firstName $lastName has $age old years.")
    }
}