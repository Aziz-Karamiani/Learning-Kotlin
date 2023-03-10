package main

fun main(args: Array<String>) {
    /*
       - A bank account class has a variable amount, and credit rating.
          Whenever a user adds money to the account, their credit rating rises.
          Whenever a user takes money from the account, their rating falls.
       - Implement this in a program.
     */
    val account = BankAccount()
    account.amount = 300
    account.amount = 400
    account.amount = 200
}

class BankAccount {
    var creditRating: Int = 500
    var amount: Int = 0
        get() = field
        set(value) {
            if (value > amount)
                creditRating++
            else
                creditRating--
            field = value
            println("Credit Rating = $creditRating")
        }
}