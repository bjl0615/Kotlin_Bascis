package eu.tutorials.kotlinbasics

fun main() {
    for(num in 1..10) {
        print("$num")
    }

    for(i in 1 until 10) {
        print("\n$i")
    }
    print("\n__________________")
    for(i in 10 downTo 1 step 2) {
        print("\n$i")
    }
}