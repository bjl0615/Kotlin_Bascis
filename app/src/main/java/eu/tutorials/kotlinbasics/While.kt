package eu.tutorials.kotlinbasics

fun main() {
    var x = 1
    while(x <= 10) {
        print("$x")
        x++
    }
    println("\n  loop is done")

    do{
        println(x)
        x++
    }while(x <= 10)
    print("x : $x")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20) {
            feltTemp = "comfy"
            println("\nit's comfy now")
        }
    }
}
