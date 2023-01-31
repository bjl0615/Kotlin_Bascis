package eu.tutorials.kotlinbasics

fun main() {

    var heightPerson1 = 170
    var heightPerson2 = 170

    if(heightPerson1 > heightPerson2) {
        print("use raw force")
    }else if(heightPerson1 == heightPerson2) {
        print("use your power tecgnique 1337")
    }else {
        print("use technique")
    }

    var age = 17
    if(age >= 21) {
        print("now you may drink in the US")
    }else if(age >= 18) {
        println("you may vote now")
    }else if(age >= 16) {
        println("you may drive now")
    }else {
        print("you're too young")
    }
}