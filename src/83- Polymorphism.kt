package polymorphism

fun main(args: Array<String>) {
    val translator = Translator()
    translator.sayHello()
    translator.sayHello("fa")
    translator.sayHello("ch")
    translator.sayHello("fr")
}

class Translator {
    fun sayHello() {
        println("English: say hello")
    }

    fun sayHello(language: String) {
        when (language) {
            "fa" -> println("فارسی: بگو سلام")
            "ch" -> println("Chinese: Ni hoa")
            else -> println("English: say hello")
        }
    }
}