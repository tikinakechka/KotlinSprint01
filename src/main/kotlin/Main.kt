fun main() {
    val totalSeconds: Int = 6480//секунд в космосе

    val hours: Int = totalSeconds / 3600
    val SecondsInHours: Int = totalSeconds % 3600
    val minutes: Int = SecondsInHours / 60
    val seconds: Int = SecondsInHours % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}

