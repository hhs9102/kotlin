package me.ham.basic

enum class Color(str: String){
    RED("red")
    ,GREEN("green");

    fun isMatch(color: String) = color == str;
}
fun main(){
    println(whenTest(Color.RED))
    println(whenTest(Color.GREEN))
}

fun whenTest(color: Color) =
    when(color){
        Color.RED -> "red"
        else -> "not matched"
    }
