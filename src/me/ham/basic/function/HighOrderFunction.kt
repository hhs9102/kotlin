package me.ham.basic.function

fun main() {
    twoAndThree{a,b -> a+b}
    twoAndThree{a,b -> a*b}
    twoAndThree{a,b -> a/b}

    processTheAnswer { i-> i*2 }
}

fun twoAndThree(operation: (Int, Int)-> Int){
    val result = operation(2,3)
    println(result)
}

fun processTheAnswer(f: (Int)->Int){
    println(f(42))
}