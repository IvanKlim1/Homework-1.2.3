package ru.netology
fun main() {
    val month=3  // какой месяц подряд совершается покупка
    val itemPrice = 300 //стоимость покупки
    val itemCount =1  //колличество покупок
    val discount = 100
    val discountStart = 1_000
    val discountFinal = 10_000
    val totalPrice = itemPrice * itemCount
    var count:Boolean =(month>4) //пользователь становится меломаном ,если покупка совершается 4 месяца подряд ,на 5 месяц идет дополнительная скидка
    if (totalPrice in (discountStart + 1) until discountFinal && count) {
        val result = totalPrice - discount
        val result1=result-result*0.01
        println("Total Price: $result1")
    } else if (totalPrice > discountFinal && count) {
        val result = totalPrice - totalPrice * 0.05
        val result1=result-result*0.01
        println("Total Price: $result1")
    } else if (totalPrice < discountStart && count) {
        val result = totalPrice
        val result1=result-result*0.01
        println("Total Price: $result1")
    } else if (totalPrice in (discountStart + 1) until discountFinal) {
        val result = totalPrice - discount
        println("Total Price: $result")
    } else if (totalPrice > discountFinal) {
        val result = totalPrice - totalPrice * 0.05
        println("Total Price: $result")
    } else if (totalPrice < discountStart) {
        val result = totalPrice
        println("Total Price: $result")
    }
}