# Kotlin
1. 카멜 표기법을 권장한다.

### 001 변수와 자료형
1. var 변경이 가능
2. val 변경이 불가능
3. class 매부 프로퍼티 : 속성
4. 그외 로컬 변수라고 한다.
5. 자료형? 를 사용할경우 null을 혀용하겠다는 의미로 사용된다.

```code

package Kotlin2020

fun main(args : Array<String>){

    val a: Int = 10 // variable : 변할 수 있는 변수 방법 -> let (js)
    val b: Int = 20 // value : 변할 수 없는 변수 선언 방법 -> const (js)
    val c: Char = 'a';
    val s: String = "String 입니다";
    val f: Boolean = true;


}

```

### 002 형변환과 배열
1. 형변환을 하기 위해서는 to자료형() 형변환 함수를 지원
2. 암시적 형변환을 지원하지 않습니다.
3. 명시적 형변환 : 변환될 자료형을 개발자가 직접 지정

```code

package Kotlin2020

fun main(args: Array<String>) {

    var intArr = arrayOf(1,2,3,4,5)
    val nullArr = arrayOfNulls<INT>(4)

    intArr[2] = 8
    println(nullArr[2])

}

```

### 003 타입추론과 함수
1. 자료형이 없이 변수를 초기화 한다면 알아서 추론된다.
2. 함수 : 특정한 동작을하거나 원하는 결과값을 가지기 위해서 사용한다.
3. 단일표현식 함수 : fun add2(a: Int, b: Int, c:Int) = a + b + c

```code

package Kotlin2020


fun add(a: Int, b: Int, c:Int): Int{
    return a + b + c
}

fun add2(a: Int, b: Int, c:Int) = a + b + c

fun main(args: Array<String>) {
    val result: Int = add(10,20,30)
    println(result)
}


```

### 004 조건문과 비교연산
1. if ~ else : 중괄호를 한 줄 이라면 생략이 가능하다.
2. 비교연산자 ( >, <, >=, <=, ==)
3. 자료형 ( 변수 is 자료형 ) 자료형이 맞는지 확인
4. 다중 조건문 when -> swich 문과 비슷 하다고 생각하면된다.

```code

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


```

### 005 반복문과 증감연산
1. ++, --
2. ++v 전위 연산자 : 값을 증가시키고 적용시킨다
3. v++ 후휘 연산자 : 실행하고 다음에 값을 증가 시킨다.

```code

package Kotlin2020

fun main(args: Array<String>) {

    var a = 0;
    while(a < 5){
        println(++a) // 1,2,3,4,5
    }

    println()
    a = 0
    while(a < 5){
        println(a++) // 0,1,2,3,4
    }

    println()
    for(i in 0..10){
        println(i)
    }

    println()
    for(i in 0..10 step 3){
        println(i)
    }

    println()
    for(i in 100 downTo 30 step 30){
        println(i)
    }

}


```


### 006 논리연산자
1. &&, ||, !


```code

package Kotlin2020

fun main(args: Array<String>) {

    for(i in 1..10){
        if(i == 3) break;
        println(i)
    }

    for(i in 1..10){
        if(i == 3) continue
        println(i)
    }

    loop@for(i in 1..10){
        for(j in 1..10){
            if(i == 2 && j == 4 ) break@loop
            println("$i : $j")
        }
    }
}

```

### 007 클래스
1. 클래스는 그 값과 그 값을 사용하는 기능을 묶어 놓은 것이다.
2. 속성 + 함수(메소)로 구현되어 있다.
3. 생성자 : 새로운 인스턴스를 만들기 위해 호출하는 함수.
    - 인스턴스 생성시 필요한 구문을 하도록 한다. init 함수
4. 보조생성자 : 기본생성자와 다른 생성자를 제공하여 인스턴스 생성시 편의를 제공하거나 추가적인 기능을 제공하는 역할을 합니다.
    - constructor 키워드 사용
    - 기본 생성작의 초기값을 주고 사용을 원할때만 사용하는게 좋아 보인다 
    - class Person(var name : String, var age: Int) 라고한다면
    - construcor(name: String):this(name, 39) => 만약 나이를 넣지 않고 초기화 한다면 기본값을 39 로 하겠다.


```code

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


```

### 006 클래스 상
1.

```code


```