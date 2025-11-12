class Item (val name: String, val type: String, val value: Int){
    constructor(name: String, type: String) : this(name, type, 0)

    fun printInfo() {
        println("Предмет: $name")
        println("Тип: $type")
        println("Стоимость: $value золотых")
        println()
    }
}

fun main() {
    val sword = Item("Меч", "оружие", 100)
    val armor = Item("Щит", "броня", 40)
    val potion = Item("Зелье силы", "зелье")

    sword.printInfo()
    armor.printInfo()
    potion.printInfo()
}
