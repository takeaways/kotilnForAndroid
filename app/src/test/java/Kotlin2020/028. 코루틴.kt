package Kotlin2020

import kotlin.coroutines.*

fun main(){
    val scope = GlobalScope
    runBlocking {
        val a = lanuch{ //JOB
            for(i in 1..45){
                println(i)
                deley(10)
            }
        }
        val b = async{ // DIfferd
            "async 종룍"
        }
        println("async 대기")
        println(b.await())
        println("launch 대기")
        a.join()
        println("launch 종료")
    }

    runBlocking{
        val result : String? = withTimeoutOrNull(50){
            for(i in 1..1000){
                println(i)
                delay(10)
            }
        }
        "finish"

    }




}