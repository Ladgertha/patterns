package ru.ladgertha.patterns.builder

fun main() {
    val cat = Cat.Builder()
        .setName("Peach")
        .setAge(2)
        .build()
}