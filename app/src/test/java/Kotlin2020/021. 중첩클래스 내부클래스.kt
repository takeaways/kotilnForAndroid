package Kotlin2020

fun main(args: Array<String>) {

    Outer.Nested().say()

    var Outer = Outer()
    val inner = Outer.Inner()

    inner.say()
    inner.say2()
    Outer.text ="Changed Test"
    inner.say2()
}

class Outer{
    var text = "Outer Class"

    class Nested{
        fun say(){
            println("Nexted Class")
        }
    }

    inner class Inner{
        var text = "Inner Class"
        fun say(){
            println(text)
        }
        fun say2(){
            println(this@Outer.text) //외부 클래스의 값에 접근이 가능해진다.
        }
    }
}