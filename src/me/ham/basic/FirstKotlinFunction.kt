package me.ham.basic

fun main(){
    expressionBody()
    blockBody()

    println(max(1,2))
    println(maxReturnInt(1,2))
}

//식이 본문인 함수
fun expressionBody(): Unit = println(if(true) "true" else "false")

//블록이 본문인 함수
fun blockBody(): Unit {
    println(if(true) "true" else "false")
}

//return 값 생략 -> 타입추론
//식(expression)이 본문인 함수의 반환 타입만 생략가능
fun max(x:Int, y:Int) = if(x>y) x else y

fun maxReturnInt(x:Int, y:Int): Int = if(x>y) x else y