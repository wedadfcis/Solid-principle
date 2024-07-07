package com.example.solid.dip.soluation

class Switch(private val device: Switchable) {
    fun operate() {
        device.turnOn()
        // Additional logic can be added here
        device.turnOff()
    }
}