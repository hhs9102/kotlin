package me.ham.basic.generic

fun <T: Comparable<T>> max (first: T, twice: T):T = if(first>twice) first else twice
//first>twice는 관례에 따라, first.compareTo(twice)로 컴파일된다.

fun main() {
    println(max(1,10))
    println(max("a","z"))
    println(max(10.0, 33.0))
}