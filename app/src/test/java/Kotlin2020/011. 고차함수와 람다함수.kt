package Kotlin2020

fun main(args: Array<String>) {
    b(::a)
    val c : (String) -> Unit = {str:String
        -> println("$str <-- 이거는 람다 함수에서 실행")
    }
    b(c)
}

//1. 파라미터로 받아보기
fun a(str: String){
    println("$str <-- 이거는 a의 값입니다.")
}
//2. 고차함수의 파라미터로 받아볼수 있도록 한다.
//기술한 형태와 같은 형식의 함수는 모두 파라미터로 받을 수 있다.
fun b(function: (String) -> Unit){
    function("b의 값이 들어 갔어")
}

