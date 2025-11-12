class Hero (val name: String, val level: Int) {
    fun canCast(spell: Spell): Boolean {
        val nameLengthOk = spell.name.length <= level * 2
        val dimensionsOk = spell.width <= 5 && spell.height <= 5
        return nameLengthOk && dimensionsOk
    }
}

fun main() {
    val hero = Hero("Герой", 5)

    val spell1 = Spell("Шаровая молния", 5, 3)
    val spell2 = Spell("Лёд",3 , 3)

    println(hero.canCast(spell1))
    println(hero.canCast(spell2))
}
