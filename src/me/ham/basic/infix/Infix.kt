package me.ham.basic.infix

infix fun String.infixDescription(str: String) = "$this ( infix(중위함수) - 메서드 호출시 점(.)을 생략하고 직관적인 이름을 사용하는 표현 방법 ) $str"
infix fun String.infixCondition(str: String) = "$this $str\nthis 키워드를 사용하고 파라미터는 하나여야 한다."
infix fun Int.infixCondition(str:String) = "[$this]str"
infix fun Int.intKeyStringValuePair(str:String) = this to str
infix fun Int.intKeyStringValueMap(str:String):Map<Int,String> = mapOf(this to str)

fun main() {
    println("가나다" infixDescription "피슝피슝")
    //가나다 ( infix(중위함수) - 메서드 호출시 점(.)을 생략하고 직관적인 이름을 사용하는 표현 방법 ) 피슝피슝
    println("가나다" infixDescription "피슝피슝" infixDescription "한번 더")
    //가나다 ( infix(중위함수) - 메서드 호출시 점(.)을 생략하고 직관적인 이름을 사용하는 표현 방법 ) 피슝피슝 ( infix(중위함수) - 메서드 호출시 점(.)을 생략하고 직관적인 이름을 사용하는 표현 방법 ) 한번 더
    println("중위함수 조건" infixCondition  "===")
    //중위함수 조건 ===
    //this 키워드를 사용하고 파라미터는 하나여야 한다.
    println(222 infixCondition "중위함수")
    //[222]str
    println(3 intKeyStringValuePair "삼_Pair")
    //(3, 삼_Pair)
    println(4 intKeyStringValueMap "사사사_Map")
    //{4=사사사_Map}
}

//infix fun Int.intKeyStringValueMap(s: String): Pair<Int,String> {
//     this to s
//}
