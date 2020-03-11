package Kotlin2020

fun main(args: Array<String>) {
    UsingGeneric(A1()).doShout()
    UsingGeneric(B1()).doShout()
    UsingGeneric(C1()).doShout()

    doShouting(B1())

}

fun <T: A1> doShouting(t: T){
    t.shout()
}



open class A1 {
    open fun shout(){
        println("A Shout")
    }
}

class B1: A1(){
    override fun shout() {
        println("B Shout")
    }
}

class C1: A1(){
    override fun shout() {
        println("C Shout")
    }

    fun say(){
        println("sayyyy")
    }
}

class UsingGeneric<T:A1>(var t : T){
    fun doShout(){
        t.shout()
    }
}
