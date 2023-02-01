package eu.tutorials.kotlinbasics

fun main() {
    myfunction()
    myfunction()
    var num = addUp(1,2)
    println("\n$num")
    var result = avg(5.0 , 13.0)
    println("result is a $result")

}

// Method - a Method us a Function within a class
// Parameter
fun addUp(a : Int, b : Int) : Int {
    return a + b
}

fun avg(a : Double, b :Double) : Double {
    return (a+b)/2
}

fun myfunction() {
    print("Called from myFunction")
}