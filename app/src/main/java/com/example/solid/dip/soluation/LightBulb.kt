package com.example.solid.dip.soluation

class LightBulb :Switchable {
    override fun turnOn() {
        println("LightBulb turned on")
    }

    override fun turnOff() {
        println("LightBulb turned off")
    }
}