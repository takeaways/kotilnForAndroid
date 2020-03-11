package Kotlin2020

fun main(args: Array<String>) {
    EventPrinter().start()
}

/*
*  1. 이벤트를 수신해서 출력하는 EventPrinter
*  2. 숫자를 카운트 하며 5의 배수 마다 이벤트를 발생시킬 Counter
*  3. 두 개를 연결시킬 인터페이스 EventListener 를 만들어 본다.
*
* */

//이벤트가 발생할 때 숫자를 반환해 준다.
interface EventListener {
    fun onEvent(count: Int) // 추상함수 만들기.
    // 리스너를 통해 이벤트를 반환하는 함수 이름은 관례적으로 'on'이라는 규칙을 따른다.
}

//이 벤트가 발생하는 Counter 클래스의 구현.
class CounterEvent(var listener: EventListener) {
    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) listener.onEvent(i)
        }
    }
}

// 이벤트를 전달 받아 화면에 출력할 EventPrinter 클래스의 구현.
class EventPrinter:EventListener{
    override fun onEvent(count: Int) {
        print("${count}-")
    }
    fun start(){
        val counter = CounterEvent(this) // * this는 키원드가 사용된 '객체 자신'을 참조하는 키워드 입니다.
        //EventPrinter 객체 자신을 나타내지만 받는쪽에서는 이벤트 리스너만 요구했기 떄문에
        //이벤트 리스너 구현부만 넘겨 주게 된다.
        //이를 객체지향의 다형성 이라고 한다.
        counter.count()
    }

}