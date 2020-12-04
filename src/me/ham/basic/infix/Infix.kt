package me.ham.basic.infix

infix fun String.infixDescription(str: String) = "$this ( infix(중위함수) - 메서드 호출시 점(.)을 생략하고 직관적인 이름을 사용하는 표현 방법 ) $str"

fun main() {
    println("가나다" infixDescription "피슝피슝")
}