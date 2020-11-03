package me.ham.basic

//val <- value, immutable 변경불가능한 변수(?) 값? = java final
//var <- variable mutable 변경가능한 변수 = java 일반 변수

val str = "문자열"
var strDeclaration:String ="문자열"

val int = 42
val intDeclaration:Int = 42

fun main(args:Array<String>){
    val name = "ham"
    println("Hello $name!")
    println("${name}님 Hello!")
    //println("$name님 hello!") 'name님'을 변수로 인식하여 compile 오류

    var test님 = "testname"
    println("$test님 Hi!")
}