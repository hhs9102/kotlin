package me.ham.basic

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int):Expr
class Sum(val left: Expr, val right: Expr):Expr

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun eval(e: Expr): Int {
    if(e is Num){
        val n = e
//        val n = e as Num -> smart cast로 is만 사용하더라도 캐스팅이 됨
        return n.value  //ide에서 smart cast 된 것은 배경색을 변경해준다.
    }

    if(e is Sum){
        val n = eval(e.left) + eval(e.right)
        return n
    }

    throw IllegalArgumentException("Unknown expression")
}

