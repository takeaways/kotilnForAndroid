package Kotlin2020

fun main(args: Array<String>) {
    val a = Book("GIBOOK", 30000).apply {
        name = "[초특가]"+name
        discount()
    }
    println(a.name)
    println(a.price)
    println()

    println("여기 아래서 부터는 run을 사용한 값을 출력하는 부분 입니다.")
    // let를 사요해보기
    val price = 1000 // 이렇게 선언 할 경우 아래 run 스코프 내부에서 불러지는 price 값이 되어 버려
    // 기존 인스턴스의 값을 불러 올 수 없게 된다.
    // 이렇때는 let 스코프 함수를 사용하여 it. 으로 접근할 수 있도록 처리 한다.
    val letResult : String = a.let{
        it.discount()
        "현재 ${it.name}책 값은 ${it.price} "
    }
    val runReuslt : String = a.run{
        discount()
        "현재 ${name}책 값은 ${price} "
    }
    println(letResult)
    println(runReuslt)
    println()

    val b: String = Book("AM_BOOK",100000).run{
        name+" LOVE"
    }
    println(b)
}

// apply 사용해보기
class Book(var name : String, var price: Int){
    fun discount(){
        price -= 2000
    }
}