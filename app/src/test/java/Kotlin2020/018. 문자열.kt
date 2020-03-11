package Kotlin2020

fun main(args: Array<String>) {
    val test1 = "Text.Kotile.String"
    println(test1.length)

    println(test1.toLowerCase())
    println(test1.toUpperCase())

    val test2 = test1.split(".")
    println(test2)
    println(test2.joinToString())
    println(test2.joinToString("-"))

    println(test1.substring(5..10))

    /*
    *  null check 가능한 함수
    *
    *  isNullOrEmpty()
    *  isNullorBlank()
    * */

    /*
    *  startWith("")
    *  endWith("")
    *  contains("")
    *
    *
    * */

}