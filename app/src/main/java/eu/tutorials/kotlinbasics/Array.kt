package eu.tutorials.kotlinbasics

fun main() {

//    val numbers : IntArray = intArrayOf(1,2,3,4,5,6)

    // val numbers = intArrayOf(1,2,3,4,5,6)

//    val numbers = arrayOf(1,2,3,4,5,6)
//    val numbersD:DoubleArray = doubleArrayOf(1.0 , 2.0 , 3.0 , 4.0 , 5.0 , 6.0)
//    print("inital values ${numbers.contentToString()}")
//
//    for(element in numbers) {
//        print(" ${element+2}")
//    }
//
//    for(element in numbers) {
//        print("$element")
//    }

//    numbersD[0] = 6.0
//    numbersD[1] = 5.0
//    numbersD[4] = 2.0
//    numbersD[5] = 1.0
//
//    print("\nfinal values ${numbers.contentToString()}")
//
//    val days = arrayOf("Sun" , "Mon" , "Tue" , "Wed" , "Thurs" , "Fri" , "Sat")
//    print(days.contentToString())

    val fruits = arrayOf(Fruit("Apple" , 2.5), Fruit("Grape" , 3.5))
    for(fruit in fruits) {
        print("${fruit.name}")
    }

    for(index in fruits.indices) {
        print("${fruits[index].name} is in index $index")
    }


}

data class Fruit(val name : String , val price : Double)