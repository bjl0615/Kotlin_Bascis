package eu.tutorials.kotlinbasics

fun main() {
    var isSunny : Boolean = true
    isSunny = false

    //Characters
    val letterChar : Char = 'A'
    val digitChar : Char = '1'

    // Strings
    val myStr : String = "Hello World"
    var firstCharInStr  = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("last character : " + lastCharInStr)
}