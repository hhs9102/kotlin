package me.ham.basic.generic

class Processor<T>{
    fun process(value : T): Int{
        return value.hashCode()
    }
}

fun main() {
    //String?는 Any?의 자손 타입이다.
    val processor = Processor<String?>()
    println(processor.process("test"))
    println(processor.process(null))
}