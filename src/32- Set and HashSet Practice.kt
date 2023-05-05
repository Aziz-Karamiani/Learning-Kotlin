fun main(args: Array<String>) {
    /*
        Your company has very strict dress code. Only certain color clothes can be worn in the office.
        val acceptedColors = hashSetOf(“white”, “black”, “grey”)
        You have certain colors in your wardrobe.
        val myColors = hashSetOf(“blue”, “red”, “black”, “green”)
        What color clothes can you wear.
        Your company has added another color, “red” to their list. What options do you have now?
     */
    val acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")
    myColors.retainAll(acceptedColors)
    println(myColors)
}