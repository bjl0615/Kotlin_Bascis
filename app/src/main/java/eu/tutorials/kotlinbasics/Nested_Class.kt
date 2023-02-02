package eu.tutorials.kotlinbasics


class OuterClass {
//outer class code
    private  var name : String = "Mr X"
        class NestedClass {
            //nested class code
            var description : String = "code inside nested class"
            private var id : Int = 101
            fun foo() {
                println("Id is ${id}")
            }
        }
}

fun main(args : Array<String>){
    println(OuterClass.NestedClass().description)

    var obj = OuterClass.NestedClass()
    obj.foo()
}