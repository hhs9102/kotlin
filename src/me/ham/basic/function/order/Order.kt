package me.ham.basic.function.order

enum class Delivery{ STANDARD, EXPEDITED }

data class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order)-> Double{
    when(delivery){
        Delivery.STANDARD
                -> return {order -> order.itemCount * 2500.0 }
        Delivery.EXPEDITED
                -> return {order -> order.itemCount * 4000.0 }
    }
}

fun getShippingCostCalculator(delivery: Delivery, order: Order): Double{
    when(delivery){
        Delivery.STANDARD
                -> return order.itemCount * 2500.0
        Delivery.EXPEDITED
                -> return order.itemCount * 4000.0
    }
}

fun main() {
    val standardCalculator = getShippingCostCalculator(Delivery.STANDARD)

    println(standardCalculator(Order(3)))
    println(getShippingCostCalculator(Delivery.STANDARD)(Order(3)))
    println(getShippingCostCalculator(Delivery.STANDARD, Order(3)))
}