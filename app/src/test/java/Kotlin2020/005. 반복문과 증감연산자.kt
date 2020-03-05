package Kotlin2020

fun main(args: Array<String>) {

    var a = 0;
    while(a < 5){
        println(++a) // 1,2,3,4,5
    }

    println()
    a = 0
    while(a < 5){
        println(a++) // 0,1,2,3,4
    }

    println()
    for(i in 0..10){
        println(i)
    }

    println()
    for(i in 0..10 step 3){
        println(i)
    }

    println()
    for(i in 100 downTo 30 step 30){
        println(i)
    }

}