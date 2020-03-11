package Kotlin2020

fun main(args: Array<String>) {
    var a = Drink()
    a.drink()

    var b : Drink = Cola()
    b.drink()
    if(b is Cola){
        b.washDishes()
    }

    var c = b as Cola
    c.washDishes()
    b.washDishes()
}

open class Drink{
    var name = "음료"
    open fun drink(){
        println("${name} 마십니다.")
    }
}

class Cola : Drink(){
    var type = "콜라"
    override fun drink() {
        println("$name 중에 $type 을 마십니다.")
    }

    fun washDishes(){
        println("${type}로 설거지를 합니다.")
    }


}

