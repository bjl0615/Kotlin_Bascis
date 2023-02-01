package eu.tutorials.kotlinbasics

fun main() {
    var denis = Person("Denus","Panjuta" , 31)
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
    denis.hobby = "skateboard"
    denis.age = 32
    println("Denis is ${denis.age} years old")
    denis.stateHobby()
    john.hobby = "play video games"
    john.stateHobby()

}

class Person(firstName : String = "John" , lastName : String = "Doe") {
    // Member Variable - Properties
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstName : String? = null

    //Initalizer block
    init {
        this.firstName = firstName
        println("Initalized a new Person object with " +
                "firstName = $firstName and lstName = $lastName" )
    }
    // Member secondart Constructor
    constructor(firstName : String , lastName : String , age : Int)
            : this(firstName, lastName) {
        this.age = age

    }

    // Memember functions - Methods
    fun stateHobby() {
        println("$firstName\'s hobby is $hobby")
    }
}