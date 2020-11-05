package me.ham.basic

//람다는 항상 중괄호 사이에 위치한다.
val action = { person: Person, message:String -> sendEmail(person, message)}


fun sendEmail(person: Person, message: String) {
    println(person)
    println(message)
}

fun main() {
    action(Person("hamhosik", false), "Hi!!")
}
