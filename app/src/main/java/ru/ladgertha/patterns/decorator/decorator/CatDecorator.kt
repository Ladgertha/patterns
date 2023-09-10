package ru.ladgertha.patterns.decorator.decorator

import ru.ladgertha.patterns.decorator.component.Cat

// Decorator
abstract class CatDecorator(private val cat: Cat) : Cat {
    override fun meow() = cat.meow()
    override fun purr() = cat.purr()
}