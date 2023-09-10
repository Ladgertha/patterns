package ru.ladgertha.patterns.decorator.component

import ru.ladgertha.patterns.decorator.component.Cat

// Concrete Component
class DomesticCat : Cat {
    override fun meow() = "Meow!"
    override fun purr() = "Purr!"
}