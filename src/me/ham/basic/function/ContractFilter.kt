package me.ham.basic.function


data class Person(val firstName: String, val lastName: String, val phoneNumber: String)

class ContractFilter(var prefix: String, var onlyWithPhoneNumber: Boolean = false){
    //Person을 받아 Boolean을 리턴
    fun getPredicate():(Person)->Boolean{

        val startsWithPrefix = {p:Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }

        if(!onlyWithPhoneNumber){
            return startsWithPrefix
        }
        return {startsWithPrefix(it) && it != null}
    }
}

fun main() {
    var lists = listOf(Person("hosik", "ham", "010-1234-5644"),
        Person("jaemin","kim","010-1231-1232"))

    val contractFilter = ContractFilter("h")
    println(lists.filter(contractFilter.getPredicate()))

    contractFilter.onlyWithPhoneNumber = true
    println(lists.filter(contractFilter.getPredicate()))

}