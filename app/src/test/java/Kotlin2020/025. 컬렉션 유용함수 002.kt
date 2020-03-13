package Kotlin2020

fun main(args: Array<String>) {
    data class Person(val name : String, val birth : Int)

    val personList = listOf<Person>(
        Person("유나",1992),
        Person("조이",1996),
        Person("츄",1999),
        Person("유나",2003)
    )
    val associted = personList.associateBy { it.birth }
    println(associted)

    val grouped = personList.groupBy { it.name }
    println(grouped)

    val (over98, upder98) = personList.partition { it.birth > 1998 }
    println(over98)
    println(upder98)

    val numbers = listOf(-3, 7,2,-10,1)
    println(numbers.flatMap { listOf(it*10, it+10, it*0) })

    println(numbers.getOrElse(1){50})
    println(numbers.getOrElse(100){50})


}