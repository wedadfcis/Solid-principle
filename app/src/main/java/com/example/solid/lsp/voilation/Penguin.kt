package com.example.solid.lsp.voilation

class Penguin: Bird(){
    override fun fly() {
        print("Penguins can't fly!")
    }
}