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
