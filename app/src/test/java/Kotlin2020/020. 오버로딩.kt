package Kotlin2020

fun main(args: Array<String>) {
    read(1)
    read("HH")
    deliveryItem("장건일", destination = "학교")
    sum(1,2,3,4,12,1,231,2,41,24,3)
}

fun read(x: Int){
    println("number $x")
}

fun read(x:String){
    println("감사합니다. $x")
}
//
fun deliveryItem(name : String, count: Int= 1 ,destination: String = "집"){
    println("$name $count $destination")
}
//
fun sum(vararg number: Int){
    for(i in number){
        println(i)
    }
}

//
infix fun Int.mul(x:Int):Int = this * x
