package com.example.solid.srp.violation

//The violation is that the Order handles more than one responsibility
// which means it has more than one reason to change.
class Order {
    fun sendOrderUpdateNotification() {
        // sends notification about order updates to the user.
    }

    fun generateInvoice() {
        // generates invoice
    }

    fun save() {
        // insert/update data in the db
    }
}