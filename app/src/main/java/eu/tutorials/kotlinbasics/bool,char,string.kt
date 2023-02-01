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
    var myLength = myStr.length

    print("first character $firstCharInStr and the length of myStr is ${myStr.length}")
}