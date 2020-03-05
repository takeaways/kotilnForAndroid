package Kotlin2020

val a1 = "피키지 스코프"

class B {
     val a = "스코프 a class"
    public fun print(){
        println(a)
    }
}

fun main(args: Array<String>) {
    var a1 = "함수 스코프"
    println(a1)
    B().print()
}