package Kotlin2020

import java.util.zip.CheckedOutputStream

object Counter {
    var count = 0;
    fun up() {
        count++
    }

    fun down() {
        if (count > 0) {
            count--
        }else{
            print("count의 최솟값인 0 입니다.")
        }
    }
}

fun main(args: Array<String>) {
    println(Counter.count)
    Counter.up()
    Counter.up()
    Counter.up()
    println(Counter.count)
    Counter.down()
    Counter.down()
    Counter.down()
    Counter.down()

    val ja = foodPoll("짜장")
    val jm = foodPoll("짬뽕")
    ja.counter()
    ja.counter()
    ja.counter()
    jm.counter()
println()
    println("ja : ${ja.count}")
    println("jm : ${jm.count}")
    println("Total : ${foodPoll.total}")

}

class foodPoll(val name : String){
    companion object {
        var total = 0
    }


    var count = 0

    fun counter(){
        total++
        count++
    }
}