package Kotlin2020

fun main(args: Array<String>) {
    var a = Gclass("s",1)
    println(a == Gclass("s",1))
    println(a.hashCode())
    println(a)


    var b= Data("d",2)



}

class Gclass(val name: String, val id: Int)
data class Data(val name: String, val id: Int)
