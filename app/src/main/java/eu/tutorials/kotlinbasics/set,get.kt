package eu.tutorials.kotlinbasics

import java.lang.IllegalArgumentException

fun main() {
    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = -5
    println("Maxspeed is ${myCar.maxSpeed}")
}

class Car() {
   lateinit var owner : String

   val myBrand : String = "BMW"
       // Custpm getter
        get() {
            return field.toLowerCase()
        }

    var maxSpeed : Int = 250
        //get() = field
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Maxspeed cannort be less than 0")
        }

    var myModel : String = "M5"
        private set

   init {
        this.owner = "Frank"
   }
}