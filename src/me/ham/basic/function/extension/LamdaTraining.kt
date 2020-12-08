package me.ham.basic.function.extension

fun main() {
    println(listOf(1,2).filter2 { it == 1 })
    println(listOf(1,2).map2 { it * 2 })
    println(listOf(1,2).map2 { it.toString() + "맵맵" })
}

fun <T> Iterable<T>.filter2(predicate: (T)->Boolean):List<T>{
    val iterator = iterator()
    if(!iterator.hasNext()) return emptyList()

    val resultList = ArrayList<T>()
    while (iterator.hasNext()){
        var element = iterator.next()
        if(predicate(element)){
            resultList.add(element)
        }
    }
    return resultList
}

fun <T,R> Iterable<T>.map2(map: (T)->R): List<R> {
    val iterator = iterator()
    if(!iterator.hasNext()) return emptyList()

    val resultList = ArrayList<R>()
    while (iterator.hasNext()) {
        var element = iterator.next()
        resultList.add(map(element))
    }
    return resultList
}