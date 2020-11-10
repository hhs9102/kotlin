package me.ham.basic.elvis

import java.lang.RuntimeException

data class Address(val city:String, val country:String)
data class Company(val name: String, val address: Address?)
data class Person(val name: String, val company: Company?)

fun main() {
    printShippingLabel(Person("ham", Company("company", Address("seoul", "korea"))))
    printShippingLabelWith(Person("ham", Company("company", Address("seoul", "korea"))))

//    printShippingLabel(Person("ham", Company("company", null)))

    var person: Person? = null
    person?.let { printShippingLabel(person) }
}


fun printShippingLabel(person: Person){
    val address = person.company?.address ?: throw RuntimeException("not exists address")
    println("${person.name}님의 주소 ${address}(으)로 배달됩니다.")
}

fun printShippingLabelWith(person: Person){
    val address = person.company?.address ?: throw RuntimeException("not exists address")
    with(person){
        println("${name}님의 주소 ${address}(으)로 배달됩니다. ")
    }
}