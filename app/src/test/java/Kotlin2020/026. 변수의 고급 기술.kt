package Kotlin2020

fun main(args: Array<String>) {
//    val foodCourt = FoodCourt()
//    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
//    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
//    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)

//    val testLateInit = LateInitSample()
//    println(testLateInit.getLateInitTest())
//    testLateInit.setTextInit("Hello world")
//    println(testLateInit.getLateInitTest())

    val number : Int by lazy{
        println("초기화를 합니다.")
        5
    }

    println("start")
    println(number)
    println(number)

}

class FoodCourt{
    fun searchPrice(foodName: String){
        val price = when(foodName){
            FOOD_CREAM_PASTA -> 13000
            FOOD_PIZZA -> 25000
            FOOD_STEAK -> 30000
            else -> 0
        }
        println("${foodName}의 가격은 ${price} 입니다.")

    }

    companion object{
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}
class LateInitSample{
    private lateinit var text: String
    fun getLateInitTest(): String {
        if(::text.isInitialized)
            return text
        else
            return "기본값"
    }

    fun setTextInit(std: String){
        text = std
    }

}
