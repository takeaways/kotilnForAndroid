package Kotlin2020


fun add(a: Int, b: Int, c:Int): Int{
    return a + b + c
}

fun add2(a: Int, b: Int, c:Int) = a + b + c

fun main(args: Array<String>) {
    val result: Int = add(10,20,30)
    println(result)
}
