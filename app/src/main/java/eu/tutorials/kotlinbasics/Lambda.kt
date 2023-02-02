package eu.tutorials.kotlinbasics

fun main() {
    // val sum : (Int , Int) -> Int = { a : Int , b : Int -> a + b}
    // println(sum(10,5))

    val sum = {a : Int , b : Int -> println(a + b)}
    sum(10,5)
}