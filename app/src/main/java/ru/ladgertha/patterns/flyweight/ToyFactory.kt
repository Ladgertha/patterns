package ru.ladgertha.patterns.flyweight

object ToyFactory {
    private val toys = mutableMapOf<String, CatToy>()

    fun getToy(name: String): CatToy {
        return toys.getOrPut(name) { CatToy(name) }
    }
}