package ru.ladgertha.patterns.decorator

import ru.ladgertha.patterns.decorator.component.DomesticCat
import ru.ladgertha.patterns.decorator.decorator.FluffyCatDecorator

fun main() {
    val persik = DomesticCat()
    val fluffyCatDecorator = FluffyCatDecorator(persik)

    println(persik.meow())
    println(persik.purr())

    println("--------------------------------")

    println(fluffyCatDecorator.meow())
    println(fluffyCatDecorator.fluff())
    println(fluffyCatDecorator.purr())
}