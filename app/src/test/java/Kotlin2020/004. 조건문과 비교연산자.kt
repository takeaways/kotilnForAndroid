package Kotlin2020

fun main(args: Array<String>) {

    var a = 10;
    if(a> 100){
        println("$a 입니다.")
    }else{
        println("안뇽 만나서 반가웡")
    }

    doWhen(1)
    doWhen("GI")
    doWhen(12L)
    doWhen(12.3)

}

fun doWhen(a: Any){
    when(a){
        1-> println("1 입니다.")
        "GI"-> println("GI 입니다.")
        is Long -> println("Long type 입니다.")
        !is Long -> println("logn type이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
}

