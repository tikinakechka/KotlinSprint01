package lesson1

fun main() {
    println("Введите количество заказов:")
    val input = readLine()
    val totalOrdersCount = input?.toIntOrNull()
    if (totalOrdersCount == null || totalOrdersCount <= 0) {
        println("Некорректный ввод данных: количество заказов должно быть больше нуля.")
    } else {
        println(totalOrdersCount)
        println("Заказ оформлен. Спасибо за покупку!")
    }
}