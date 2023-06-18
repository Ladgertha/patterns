package ru.ladgertha.patterns.builder

class Cat private constructor(
    val name: String,
    val age: Int,
    val color: String,
    val breed: String
) {


    class Builder {
        private var name: String = "Barsik"
        private var age: Int = 1
        private var color: String = "yellow"
        private var breed: String = ""

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setAge(age: Int): Builder {
            this.age = age
            return this
        }

        fun setColor(color: String): Builder {
            this.color = color
            return this
        }

        fun setBreed(breed: String): Builder {
            this.breed = breed
            return this
        }

        fun build(): Cat {
            return Cat(name, age, color, breed)
        }
    }
}