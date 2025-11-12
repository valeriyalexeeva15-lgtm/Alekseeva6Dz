class Location  (val name: String,
val dangerLevel: String = "Низкий",
val requiredLevel: Int = 1
) {
    fun isDangerous() = dangerLevel == "Высокий"
}

fun main() {
    val safeLocation = Location("Деревня", "Низкий", 1)
    val dangerousLocation = Location("Пещера", "Высокий", 5)

    println(safeLocation.name)
    println(safeLocation.isDangerous())

    println(dangerousLocation.name)
    println(dangerousLocation.isDangerous())
}


