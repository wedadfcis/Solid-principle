package com.example.solid.dip.voilation

class Switch {
    private val bulb = LightBulb()

    fun operate() {
        bulb.turnOn()
        // Additional logic can be added here
        bulb.turnOff()
    }
}