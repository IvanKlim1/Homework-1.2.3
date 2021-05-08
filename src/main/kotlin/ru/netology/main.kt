package ru.netology
fun main() {
    val month=5  // какой месяц подряд совершается покупка
    val itemPrice = 400 //стоимость покупки
    val itemCount =5 //колличество покупок
    val discount = 100
    val discountStart = 1_000
    val discountFinal = 10_000
    val totalPrice = itemPrice * itemCount
    val totalPriceFinal=totalPrice*0.05
    var count:Boolean =(month>4) //пользователь становится меломаном ,если покупка совершается 4 месяца подряд ,на 5 месяц идет дополнительная скидка
    var result=0
    when {
        (totalPrice in (discountStart + 1) until discountFinal) ->
             result = totalPrice - discount
        (totalPrice > discountFinal) ->
             result = (totalPrice - totalPriceFinal).toInt()
        (totalPrice < discountStart) ->
             result = totalPrice
    }
    if (count) {
        var result1=result-result*0.01
        println(result1)
    } else
    println(result)
}