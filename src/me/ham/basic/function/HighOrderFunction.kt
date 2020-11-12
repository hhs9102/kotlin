package me.ham.basic.function

import java.lang.StringBuilder

fun main() {
    twoAndThree{a,b -> a+b}
    twoAndThree{a,b -> a*b}
    twoAndThree{a,b -> a/b}

    processTheAnswer { i-> i*2 }

    println(listOf("String","Test","Join")
        .joinToString(",","Pre_","_Post"))
    println(listOf("String","Test","Join")
        .joinToString(",","Pre_","_Post"){it.toUpperCase()})
    println(listOf("String","Test","Join")
        .joinToString{it.toLowerCase()})
}

fun twoAndThree(operation: (Int, Int)-> Int){
    val result = operation(2,3)
    println(result)
}

fun processTheAnswer(f: (Int)->Int){
    println(f(42))
}

fun <T> Collection<T>.joinToString(
    seperater:String,
    prefix:String,
    postfix:String,
    transform: (T)-> String = {it.toString()}
):String{
    var result = StringBuilder(prefix)
    for((index,element) in this.withIndex()){
        if(index>0){
            result.append(seperater)
        }
        result.append(transform(element))
    }
    result.append(postfix)
    return result.toString()
}