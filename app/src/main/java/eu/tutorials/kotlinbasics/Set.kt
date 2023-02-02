package eu.tutorials.kotlinbasics

fun main() {

    val fruits = setOf("Orange" , "Apple" , "Grpae" , "Mango" , "Apple")
    // print(fruits.toString())

//    val newFruits = fruits.toMutableList()
//    newFruits.add("Water Melon")
//    newFruits.add("Pear")
//    print(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday" , 3 to "Wednesday")

    for(key in daysOfTheWeek.keys) {
        // print("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruit("Grape" , 2.5),
                            "OK" to Fruit("Apple" , 1.0))

    val newDayOfWeek = daysOfTheWeek.toMutableMap()
    newDayOfWeek[4] = "Thursday"
    newDayOfWeek[5] = "Friday"

    println(newDayOfWeek.toSortedMap())
}

data class Fruit(val name : String, val price : Double)

