package Kotlin2020

fun main(args: Array<String>) {
    val person1 = Person("gi", 920105,1)
    val person2 = Person("vv", 920106, 2)
    val person3 = Person("dj", 920106, 3)
    val person4 = Person("cc", 920106, 29)

    person4.greeting()
//    person1.greeting()

}

//이렇게 변수 키워드를 적어줘야 함수 내부에서 변수로 사용이 가능합니다.
class Person(var name: String , val birthDay : Int, var age:Int){

    init{
        println("${this.name} , ${this.birthDay} $age")
    }

    //보조 생성자를 사용하기 위해서는 무조건 기본 생성자를 초기화를 해줘야 한다. :this(기본생성자의 필요)
    constructor(name: String, age:Int):this(name, 1997, age){
        println("보조 생성자가 사용되었습니다.")
        println("${name} 입니다. -> ${birthDay} : ${age}")
    }


    fun greeting(){
        println("${name} 입니다. -> ${birthDay}")
    }
}

//생성자란?
