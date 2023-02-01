package eu.tutorials.kotlinbasics

fun main() {

    var name : String = "Denis"
    name = "Adam"

    var nullableName : String? = "Denis"
    nullableName = null

    var len = name.length

    // 1
//    if(nullableName != null) {
//        var len2 = nullableName.length
//    }else {
//        null
//    }

    // 2
    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }

}