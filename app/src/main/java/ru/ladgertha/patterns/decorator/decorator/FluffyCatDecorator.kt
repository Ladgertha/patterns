package ru.ladgertha.patterns.decorator.decorator

import ru.ladgertha.patterns.decorator.component.Cat

// Concrete Decorator
class FluffyCatDecorator(cat: Cat) : CatDecorator(cat) {
    fun fluff() = "I'm fluffy cat!"
    override fun purr() = super.purr() + " I am fluffier!"
}