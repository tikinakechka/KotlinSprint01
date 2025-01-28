fun main() {
    println("Введите количество заказов:")
    val input = readLine()
    val thx = "Спасибо за покупку!"
    val totalOrdersCount: Int? = input?.toIntOrNull()
    if (totalOrdersCount == null || totalOrdersCount <= 0) {
        println("Некорректный ввод данных: количество заказов должно быть больше нуля.")
        return
    } else {
        println("$totalOrdersCount")
        println("$thx")
    }
    var totalEmployeesCount = 2000
    println("Количество работников: $totalEmployeesCount")

    totalEmployeesCount -= 1
    println("Количество работников после увольнения: $totalEmployeesCount")
}
