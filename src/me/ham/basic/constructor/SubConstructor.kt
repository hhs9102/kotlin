package me.ham.basic.constructor

class SubConstructor {
    val value: String
    constructor(_value: String = "default"){
        value = _value
    }
}


fun main() {
    val sc = SubConstructor("test")
    println(sc.value)

    val defaultSc = SubConstructor()
    println(defaultSc.value)
}