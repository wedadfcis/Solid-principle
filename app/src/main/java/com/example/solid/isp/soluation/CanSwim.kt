package com.example.solid.isp.soluation

interface CanSwim {
    fun swim()
}

interface CanFly {
    fun fly()
}

class Duck : CanSwim, CanFly {
    override fun swim() {
        println("Duck swimming")
    }

    override fun fly() {
        println("Duck flying")
    }
}

class Penguin : CanSwim {
    override fun swim() {
        println("Penguin swimming")
    }
}