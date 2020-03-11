package Kotlin2020

fun main(args: Array<String>) {
    var a : String ? = "sd"

//    a?.run{
//        println(toUpperCase())
//        println(toLowerCase())
//    }

    var v1 = Product("콜라",1000)
    var v2 = Product("콜라",1000)
    var v3 = v1;
    var v4 = Product("사이다",1000)

    println(v1 == v2)
    println(v1 === v2)

    println(v1 === v3)
    println(v1 == v3)

    println(v1 == v4)
    println(v1 === v4)





}

class Product(val name : String, val price : Int){
    override fun equals(other: Any?): Boolean {
        if(other is Product){
            return other.name == name && other.price == price
        }else{
            return false
        }
    }
}