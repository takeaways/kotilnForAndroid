package Kotlin2020

fun main(args: Array<String>) {

    val t = Tiger()
    t.eat()
    t.eat("고기")

    val c = Benz()
    c.drive()
    c.stop()
    println()
    val m = Me()
    m.eat()
    m.run()


}

open class Animal {
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Tiger : Animal() {
    fun eat(food: String) {
        println("${food}를 먹습니다.")
    }

    override fun eat() {
        println("타이거가 음식을 엄청나게 맛나게 먹고 있습니다.")
    }
}

abstract class Car {
    abstract fun drive()
    fun stop() {
        println("정지 합니다.")
    }
}

class Benz : Car() {
    override fun drive() {
        println("자동차가 출발 합니다.")
    }
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

class Me : Runner, Eater {
    override fun run() {
        println("달리기하기")
    }

    override fun eat(){
        println("dkdkdk")
    }
}