fun main(args: Array<String>) {
    val user2 = User2("Aziz", "Password")
    println(user2)
    println(user2::class.java)
}

data class User2(val userName: String, val password: String)

