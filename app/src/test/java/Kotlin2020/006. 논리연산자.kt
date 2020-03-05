package Kotlin2020

fun main(args: Array<String>) {
    println()
    for (i in 1..10) {
        if (i == 3) break;
        println(i)
    }
    println()
    for (i in 1..10) {
        if (i == 3) continue
        println(i)
    }
    println()
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 2 && j == 4) break@loop
            println("$i : $j")
        }
    }
    println()

    println(true && false)
    println(true || false)
    println(!true)
    println(!false)

    println()

    val a = 10
    println(a > 6 && a < 9)


}