package eu.tutorials.kotlinbasics

// Super Class , Parent Class, Base Class

// Sub Class Child Class or Derived class if Vehicle
// Super Class , Parent Class, Base Class of Vehicle
open class Car(val name : String , val brand : String){
    open var range : Double = 0.0

    fun extendRange(amount : Double) {
        if(amount > 0 )
            range += amount
    }

    open fun drive(distance : Double) {
        println("Drive for $distance KM")
    }
}

// Sub Class child Class or Derived class of Car
class ElectricCar(name : String , brand : String , batterLfe : Double) : Car( name,  brand) {
    var chargerType = "Type1"
    override  var range = batterLfe * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electrictiy")
    }

    fun drive() {
        println("Drove for $range KM on electricity")
    }


}

fun main() {
    var audiA3 = Car("A3" , "Audi")
    var teslaS = ElectricCar("S-Model" , "Tesla" , 85.0)

    teslaS.chargerType = "Type2"
    teslaS.extendRange(200.0)

    teslaS.drive()

    // PolyMorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)

}