class Enemy (val health: Int, val aggressionLevel: Int = 2) {
    fun calculatePower(): Int {
        return health * aggressionLevel
    }
}

fun main() {
    val enemy1 = Enemy(60, 4)
    val enemy2 = Enemy(40) // aggressionLevel = 2 по умолчанию
    val enemy3 = Enemy(100, 6)

    println("Враг 1: сила = ${enemy1.calculatePower()}")
    println("Враг 2: сила = ${enemy2.calculatePower()}")
    println("Враг 3: сила = ${enemy3.calculatePower()}")
}
