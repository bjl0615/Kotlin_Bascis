package eu.tutorials.kotlinbasics

open class Base {
    open protected val i = 5
}

class Another : Base() {
    fun getValue() : Int {
        return i
    }
    override val i = 10
}