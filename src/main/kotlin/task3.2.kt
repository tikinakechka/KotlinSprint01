fun main() {
    val departureHours = 9
    val departureMinutes = 39
    println("Время выезда $departureHours:$departureMinutes")
    val travelMinutes = 457
    println("Время в пути $travelMinutes")
    val conversion = departureHours * 60 + departureMinutes
    val arrivingTime = conversion + travelMinutes
    val hours = arrivingTime / 60
    val minutes = arrivingTime % 60
    val formattedTime = String.format("%02d:%02d", hours, minutes)
    println("Время прибытия: $formattedTime")
}