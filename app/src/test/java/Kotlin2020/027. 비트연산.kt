package Kotlin2020

fun main(args: Array<String>) {
    var bitData : Int = 0b10000 //지정되지 않은 상위비트는 0으로 채워 집니다.
    bitData = (1 shl 2)
    bitData = (1 shr 2)

    bitData = bitData or (1 shl 2) // 1이라는 값을 자측으로 2번 밀기
    println(bitData.toString(2))
    bitData = bitData or (1 shr 2)//  1이라는 값을 우측으로 2번 밀기
}