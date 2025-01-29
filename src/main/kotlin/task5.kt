fun main() {
    val totalSeconds: Int = 6480
    val SECONDS_IN_MINUTE = 60

    val hours: Int = totalSeconds / (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE)
    val secondsInHours: Int = totalSeconds % (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE)
    val minutes: Int = secondsInHours / SECONDS_IN_MINUTE
    val seconds: Int = secondsInHours % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}
