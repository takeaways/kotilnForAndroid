package Kotlin2020

fun main(args: Array<String>) {

    val intArr = arrayOf(1,2,3,4,5)
    val nullArr = arrayOfNulls<Int>(4)

    intArr[2] = 8
    println(nullArr[2])

}