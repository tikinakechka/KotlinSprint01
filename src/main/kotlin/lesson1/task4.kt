package lesson1

data class Time(val hour: Int, val minute: Int)

private fun formatTime(time: Time): String = "${time.hour}:${time.minute}"

fun main() {
    val person = "Юрий Гагарин"
    val year = 1961

    val launchTime = Time(9, 7)
    val landingTime = Time(10, 55)

    println("$person совершил полет в космос")
    println("Год полета: $year")
    println("Время взлета: ${formatTime(launchTime)}")
    println("Время посадки: ${formatTime(landingTime)}")

    val length = 40_868_600_000 // Расстояние (мм)
    val age = 27 // возраст
    val partOfDay = 0.075 // часть дня
    val seconds: Short = 6480 // секунд провел
    val partOfYear = 2.0547945205479453E-4 // часть года
    val apogee = 327_000 // м апогей орбиты

    println("Расстояние: $length мм")
    println("Возраст: $age лет")
    println("Часть дня: $partOfDay")
    println("Секунды в космосе: $seconds сек")
    println("Часть года: $partOfYear")
    println("Апогей орбиты: $apogee м")
}
