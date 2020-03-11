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
0. *var, val 등을 붙이면 자체 속성으로 선언이 된다.
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



```

### 006 클래스 상속
1. 기존 클래스를 확장하여 새로운 속성이나 함수를 만들어야 할 떄
2. 공통점을 뽑아 관리를 편하게 하기 위해서
3. super class & sub class
4. 'open' 상속을 허용하기 위한 키워드
    - 서브클래스는 수퍼 클래스에 존재하는 속성과 '같은 이름'의 속성을 가질 수 없음
        - 그렇기 때문에 생성시 처기값에 변수 키워드(var, val)를 사용하지 않는다.
    - 서브 클래스가 생성될 때는 반드시 수퍼클래스의 생성자까지 호출되어야 한다.
        - class 자식클래스 () : 부모클래스() {}와 값이 사용해서 꼭 부모 클래스의 초기 값을 전달해 줘야 한다.
5. 자식 클래스만의 독자적인 기능 추가하는 것이 가능핟.


```code

package Kotlin2020

fun main(args: Array<String>) {
    val a = Animal("동물", 2,"고래")
    val dog1 = Dog("멍멍이", 5)
    val cat1 = Cat("나폴레옹",2)

    a.greeting()
    println()
    dog1.greeting()
    dog1.bark()
    println()
    cat1.greeting()
    cat1.bark()
}

open class Animal(var name: String, var age: Int, var type: String){
    fun greeting(){
        println("안녕 하세요 ${name} 입니다. ${age}, ${type} 입니다.")
    }
}

class Dog(name: String, age: Int ) : Animal(name, age, "dog"){
    fun bark(){
        println("$name bow - bow ")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "cat"){
    fun bark(){
        println("${name} mew - mew")
    }
}

```

### 007 오버라이딩과 추상화 
1. 수퍼클래스에서 허용만 한다면 같은 이름과 형태를 가진 함수를 재정의 할 수 있다
2. 추상화란? :  "abstract" 키워드 사용 -> 무조건 오버라이팅 해줘야 해야 한다.
    - 선언부만 있고 깃능이 구현되지 않은 추상함수 
    - "추상함수"를 포함하는 "추상 클래스"로 구성된다.

3. 인터페이스 사용가능 : 구현부가 있는 함수 + 없는 함수를 동시에 사용하능하나 생성자가 없을 뿐이다. -> 자바랑은 조금 다른 부분이네
    - 인터페이스에서 구현부가 있는 함수 : open 함수로 취급 -> 오버라이딩 가능
    - 인터페이스에서 구현부가 없는 함수 : abstract 함수로 취급 -> 무조건 구현 해줘야 한다.
    - 그렇기 때문에 키워드를 사용하지 않아도 된다.
    - 또 한 여럿 인터페이스를 상속 받을 수 있다.
4. 오버라이딩은 이미 구현이 끝난 함수의 기능을 서브 클래스에서 변경해야 할 때 그리고 추상화는 실제 구현은 서브클래스에서 일임할 때 사용하는 기능이며
인터 페이스는 서로다른 기능들을 구현할 때 여러개를 물려주어야 할 떄 유용한 기능입니다.

```code

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

```


### 008 변수, 함수, 클래스의 접근범위와 접근제한자는?
1. 스코프와 접근제한자.
    - 스코프 외부에서는 스코프 내부의 멤버를 '참조연산자(.)'로만 접근이 가능하다.
    - 동일 스코프 내에서는  멤버들을 공유 할 수 있다.
2. 접근제한자 : 변수, 함수, 클래스, 맨 앞에 붙여 사용됩니다.
    - public, internal, private,protected
    - 패키지 스코프에서
        - public(기본값) : 어떤 패키지에서도 접근 가능.
        - internal : 같은 모듈 내에서만 접근 가능.
        - private : 같은 파일 내에서만 접근이 가능.
        - protected : 사용하지 않음.
    - 클래스 스코프에서는
        - public(기본값) : 클래스 외부에서 늘 접근 가능
        - private : 클래스 내부에서만 접근 가능
        - protected : 클래스 자신과 상속받은 클래스에서 접근 가능
        - internal : 사용하지 않음.
```code

package Kotlin2020

val a1 = "피키지 스코프"

class B {
    val a = "스코프 a class"
    fun print(){
        println(a)
    }
}

fun main(args: Array<String>) {
    var a1 = "함수 스코프"
    println(a1)
    B().print()
}

```

### 009 고차함수와 람다 함수
0. 고차함수는 함수를 변수처럼 사용가능하다는 느낌이며, ::함수명 으로 사용한다.
    - 즉, 변수가 되는 쪽이 고차함수 입니다.
1. 고차함수 함수를 '인스턴스처럼' 취급하는 방법
    - 함수를 '파라미터'로 넘겨 줄 수 있다.
    - '결과값으로 반환' 받을 수 있는 방법이다.
    - 함수의 형식을 자료형으로 나타내기
        - (자료형, 자료형) -> 반환형
    - b(::a)와 같이 ::a 파라미터로 전달할 함수 로 사용
2. 람다함수
    - 람다함수는 그 자체가 고차 함수이다.
    - 별도의 연산자 없이도 변수에 담을 수 있다.

```code

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

```

### 011 스코프 함수
1. 람다 함수도 여러 구문의 사용이 가능하다.
    - 여러줄로 표현이 가능하며, 마지막 줄이 반환 값이 된다.
    - 파라미터가 없다면, 실행할 구문만 나열하면 된다.
        - val c : () -> Unit = {println("Hello world")}
    - 파라미터가 하나 뿐이라면 it 사용이 가능하다.
        - val c : (String) -> String = { "$it 반값 습니다"}
2. 스코프함수란?
    - 함수형 언어의 특징을 좀 더 편리하게 사용할 수 있도록 기본 제공하는 함수들
        - 클래스의 인스턴스를 '스코프함수'에 전달하면, 인스턴스의 속성이나 함수를 스코프 함수 내에서 편하게 사용할 수 있도록 하는 기능
        - apply, run, with, also, let
            - apply : 인스턴스를 생성한 후 변수에 담기전에 초기화 과정을 수행할 떄 사용하며, 인스턴스를 다시 반환한다. 인스턴스를 생성할 때 인스턴스의 값에 변화를 준 다음 생성하기를 원할 때 사용한다.
            - run : apply와 마찬가지로 참조 연산자를 사용하지 않도 된다는 것은 같으나, 일반 람다 함수 처럼 맨 마지막의 결과 값을 리턴 한다. 인스턴스가 만들어 진후에 인스턴스의 함수나 속성을 스코프 내에서 사용해야 할 때 유용하다.
            - with : run 과 동일한 기능을 하나, 사용법만 다르다. with(a){} 이렇게 인스털스를 파라미터로 받는다.
            - also / let: apply와 run과 같은 동작을 하는 스코프 함수이나, 해당 스코프 외부에서 선언된 변수가 있다면 그 변수를 우천 참조하기 때문에 자신의 변수를 it. 키워드를 참조하여 접근한다.


```code

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

```

### 012 오브젝트
1. 생성자 없이 객체를 직접 만들어내는 object
2. 클래스는 인스턴스 객체를 만들어 내기위한 틀이기 때문에 내부에 있는 속성이나 하수를 사용하기 위해서는
    생성자를 통하여 실체가 되는 인스턴스 객체를 만들어 사용해야 한다. 
3. 그러나 여러개의 인스턴스를 만들 필요없이 하나의 객체 만으로 공톡적인 속성과 함수를 사용해야하는
    코드에서는 굳이 class를 사용할 필요 없이 사용이 가능하다.
4. 클래스 내부에서도 object(Companion Object) 를 만들어 사용할 수 있다. 
    - 클래스의 인스턴스 기능은 그대로 사용하면서 인스턴스 간에 공통으로 사용할 속성과 함수를 만드는 기능이다.
    - 기존의 Static 멤버 : 클래스 내부에서 별도의 영역에 고정적으로 존재하여 인스턴스를 생성하지 않아도 공용으로 사용 가능한 속성이나 함수 라고 볼 수 있다.

```code
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
```

### 013 옵져버 패턴
1. 이벤트가 일어나는 것을 감시하는 감시자.
    - 키의 입력, 터치의 발생, 데이터의 수신등 함수로 직접 요청하지 않았지만 시스템 또는 루틴에 의해서 발생하게되는 동작들을 '이벤트'라고 부르며
    이 이벤트가 발생할 떄만다 '즉각적으로 처리'할 수 있도록 만드는 패턴을 '옵저버 패턴이라고 부른다'
2. 두 개의 클래스가 필요하다.
    - 이벤트를 수신 하는 클래스 / 이벤트의 발생 및 전달을 하는 클래스 
    - 두 개의 클래스 사이에 인터페이스를 끼워넣어 주며 이를 '옵져버' 코틀린에서는 '리스너'라고 부른다.

```code



```