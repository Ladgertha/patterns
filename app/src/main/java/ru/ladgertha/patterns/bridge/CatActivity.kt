package ru.ladgertha.patterns.bridge

import androidx.appcompat.app.AppCompatActivity

class CatActivity : AppCompatActivity(), CatDataTransmitter {
    override fun transmit(data: String) {
        // Handle the data
    }
}