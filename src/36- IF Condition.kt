package main

fun main(args: Array<String>) {
    /*
    Define two variables
        val hasEggs = true
        val hasBacon = false
        A man goes to the market. His instructions are:

        If you find eggs, buy 12
        If you buy eggs, and you also find bacon, buy two packs
        Eggs cost 5 each.
        A pack of bacon costs 20.
        How much does the man spend at the market?
     */
    val hasEggs = true
    val hasBacon = false
    var numberOfEggs = 0
    var numberOfBacon = 0
    if (hasEggs) {
        numberOfEggs = 12
        if (hasBacon) {
            numberOfBacon = 2
        }
    }

    println(numberOfEggs * 5 + numberOfBacon * 20)
}