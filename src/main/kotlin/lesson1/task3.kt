package lesson1

data class Time(val hour: Int, val minute: Int)

fun formatTime(hour: Int, minute: Int): String {
    require(hour in 0..23) { "Hour must be between 0 and 23" }
    require(minute in 0..59) { "Minute must be between 0 and 59" }
    return String.format( "%02d:%02d", hour, minute)
}

fun main() {
    val person = "Юрий Гагарин"
    val year: Int = 1961

    val launchTime = Time(9, 7)
    val landingTime = Time(10, 55)

    println("$person совершил полет в космос")
    println("Год полета: $year")
    println("Время взлета: ${formatTime(launchTime.hour, launchTime.minute)}")
    println("Время посадки: ${formatTime(landingTime.hour, landingTime.minute)}")
}