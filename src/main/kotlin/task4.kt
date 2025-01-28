fun applyBuff(resources: Int, percentage: Int): Int {
    if (resources > 0 && percentage > 0) {
        return resources * percentage / 100
    } else {
        return 0
    }
}

fun main() {
    val crystals = 7 // Добыто кристаллов
    val iron = 11    // Добыто железа

    // бонусные ресурсы
    val bonusCrystals = applyBuff(crystals, 20)
    val bonusIron = applyBuff(iron, 20)

    println("Бонусные кристаллы: $bonusCrystals")
    println("Бонусное железо: $bonusIron")
}