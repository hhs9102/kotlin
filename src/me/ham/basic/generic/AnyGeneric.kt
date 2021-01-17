package me.ham.basic.generic

fun joinStringNullable(list: List<*>) = list.joinToString(",")
//원소의 추가나 변경이 없을 경우 어떤 값을 넘기더라도 안전하다.
fun joinString(list: List<Any>) = list.joinToString(",")

//원소의 추가나 변경이 있을 경우 타입 불일치가 일어날 가능성이 존재하기 때문에 사용할 수 없다.
fun add42Number(list: MutableList<Any>) = list.add(42)

fun main() {
    println(joinStringNullable(listOf("a","b", null)))
    println(joinString(listOf("a","b")))

//    println(add42Number(listOf("a"))) compile 불가 (컴파일이 가능하다면 런타임시에 casting 오류가 발생한다.)
//    println(add42Number(listOf(42))) compile 불가
}