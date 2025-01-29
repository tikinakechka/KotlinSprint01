fun main() {
    val workers: Int = 50
    val salary1: Int = 30000
    val interns: Int = 30
    val salary2: Int = 20000

    val expences1 = (workers * salary1)
    val expences2 = (interns * salary2)

    val totalExpences = (expences1 + expences2)
    val totalWorkers = (interns + workers)

    val average: Double = totalExpences.toDouble() / totalWorkers
    val averageSalary = average.toInt()

    println("Средняя зп работника после прихода стажеров: $averageSalary руб")
    println("Расходы на постоянных сотрудников: $expences1 руб")
    println("Общие расходы на зарплату с приходом стажеров: $totalExpences руб")
}