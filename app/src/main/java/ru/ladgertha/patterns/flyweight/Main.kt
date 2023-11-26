package ru.ladgertha.patterns.flyweight

fun main() {
    val toy1 = ToyFactory.getToy("Мячик")
    val cat1 = Cat("Барсик", 3, "Сиамский", toy1)
    val cat2 = Cat("Мурзик", 5, "Британец", toy1)
}
