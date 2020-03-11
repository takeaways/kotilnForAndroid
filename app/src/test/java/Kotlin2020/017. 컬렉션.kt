package Kotlin2020

fun main(args: Array<String>) {
    val a = listOf(1,2,3,4)
    for(i in a){
        println(i)
    }
    val b = mutableListOf(1,2,3,4,5)
    println(b)
    b.add(5)
    println(b)
    b.add(1,0)
    b.shuffle()
    println(b)
}