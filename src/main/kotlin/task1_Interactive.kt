fun main() {
    var OrdersCount: Int = 75
    val thankYou: String = "Спасибо за покупку!"

    println("Укажите кол-во товаров:")
    val input = readLine()
    val totalOrdersCount = input?.toIntOrNull()

    if (totalOrdersCount != null && OrdersCount > 0) {
        println("$thankYou")
    }
}