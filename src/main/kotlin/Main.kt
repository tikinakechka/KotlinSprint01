fun main() {
    val year = 1961
    val launchHour = 9
    val launchMinute = 7

    var landingHour = 10
    var landingMinute = 55

    println("Юрий Гагарин совершил полет в космос")
    println("Год полета: $year")
    println("Время взлета: $launchHour:${String.format("%02d", launchMinute)}")

    println("Время посадки: $landingHour:${String.format("%02d", landingMinute)}")
}
