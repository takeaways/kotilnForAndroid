package Kotlin2020

fun main(args: Array<String>) {
    val a = Book("GIBOOK", 30000).apply {
        name = "[초특가]"+name
        discount()
    }

    println(a.name)
    println(a.price)
}

class Book(var name : String, var price: Int){
    fun discount(){
        price -= 2000
    }
}