package me.ham.basic

import me.ham.basic.delegation.PropertyChangeAware
import java.beans.PropertyChangeListener
import java.util.Random

//public class FirstKotlinClass {
//
//    private final String name;
//
//    public FirstKotlinClass(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}

//값 객체 = 코드가 없이 데이터만 저장하는 클래스
class FirstKotlinClass(val name: String) //public 생략 -> kotlin 기본 접근제한자 = public


class Person(
    val name: String,
    isMarried: Boolean
): PropertyChangeAware(){

    var isMarried: Boolean = isMarried
    set(newValue){
        var oldValue = field
        field = newValue
        changeSupport.firePropertyChange("isMarried", oldValue, newValue)
    }
}

class Rectangle(val height:Int, val width:Int){
    val isSquare :Boolean
    get()= height==width    //custom property getter

    fun isSquareFunction(): Boolean = height==width

    /*
    두 방식의 성능, 구현의 차이는 없고 차이가 나는 것은 가독성뿐.
    일반적으로 클래스의 특성을 정의하고 싶다면 프로퍼티로 그 특성을 정의해야한다. -> 따라서 val isSquare가 좀 더 낫다.
     */
}

fun main(){
    val rectangle = Rectangle(10, 10)
    println("custom getter value :: ${rectangle.isSquare}")
    println("function call value :: ${rectangle.isSquareFunction()}")

    val createRandomRectangle = createRandomRectangle()
    println("randomRectange width : ${createRandomRectangle.width}, height : ${createRandomRectangle.height}")

    println(createRandomRectangle().isSquare)

    var person = Person("ham",false)
    person.addPropertyChangeListener(PropertyChangeListener {event->
        println("property ${event.propertyName}가 변경되었습니다. oldValue: ${event.oldValue}, newValue: ${event.newValue}")
    });

    person.isMarried = true
    person.isMarried = false
}

fun createRandomRectangle(): Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
