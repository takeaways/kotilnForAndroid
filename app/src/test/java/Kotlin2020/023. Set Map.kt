package Kotlin2020

fun main(args: Array<String>) {
    val a = mutableSetOf("바나나","사과","김치")
    for(item in a){
        println("${item}")
    }

    a.add("사과")
    a.add("귤")
    println(a)

    val b = mutableMapOf("d" to "11","d2" to "22" )
    for(e in b){
        println("${e.key} : ${e.value}")
    }
}