package com.example.solid.lsp.soluation

class Eagle : Bird(), IFlyingBird {
    override fun fly(): Boolean {
        return true
    }
}