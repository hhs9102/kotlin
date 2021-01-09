package me.ham.basic.function.extension

import java.util.ArrayList

fun main() {
    println(listOf(1,2).filter { it % 2 != 1 })
    println(listOf(1,2).filter2 { this % 2 != 1 })
    println(listOf(1,2).filter3 { it % 2 != 1 })
//    println(listOf(1,2).map2 { it * 2 })
//    println(listOf(1,2).map2 { it.toString() + "맵맵" })

    listOf(1,2).map { it.toString() }
}

fun <T> Iterable<T>.filter2(predicate: T.()->Boolean):List<T>{
    var iterator = this.iterator()
    var result = ArrayList<T>()
    while (iterator.hasNext()){
        val t = iterator.next()
        if(predicate(t)){
            result.add(t)
        }
    }
    return result
}

fun <T> Iterable<T>.filter3(predicate: (T)->Boolean):List<T>{
    var iterator = this.iterator()
    var result = ArrayList<T>()
    while (iterator.hasNext()){
        val t = iterator.next()
        if(predicate(t)){
            result.add(t)
        }
    }
    return result
}