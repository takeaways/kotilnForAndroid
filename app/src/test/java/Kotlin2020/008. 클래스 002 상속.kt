package Kotlin2020

fun main(args: Array<String>) {
    val a = Animal("동물", 2,"고래")
    val dog1 = Dog("멍멍이", 5)
    val cat1 = Cat("나폴레옹",2)

    a.greeting()
    println()
    dog1.greeting()
    dog1.bark()
    println()
    cat1.greeting()
    cat1.bark()
}

open class Animal(var name: String, var age: Int, var type: String){
    fun greeting(){
        println("안녕 하세요 ${name} 입니다. ${age}, ${type} 입니다.")
    }
}

class Dog(name: String, age: Int ) : Animal(name, age, "dog"){
    fun bark(){
        println("$name bow - bow ")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "cat"){
    fun bark(){
        println("${name} mew - mew")
    }
}