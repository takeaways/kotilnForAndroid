package Kotlin2020

fun main(args: Array<String>) {
    val nameList = listOf("박수영", "김지수", "김다현", "신유나","김지우")
    nameList.forEach{println(it)}
    println()
    val newNameList = nameList.map{name -> "welcome , $name"}
    println(newNameList)
    val kimList = nameList.filter{it.contains("장")}
    println(kimList)
}