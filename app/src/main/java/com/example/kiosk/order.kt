package com.example.kiosk

import com.example.kiosk_final.Menu


class Order {
    private val shoppingCart: ArrayList<Menu> = ArrayList()

    fun addMenuToCart(menu: Menu) {
        shoppingCart.add(menu)
    }

    fun viewCart() {
        println("---- Shopping Cart ----")
        for ((index, item) in shoppingCart.withIndex()) {
            println("[${index + 1}] ${item.name} | W${item.price} | ${item.introduce}")
        }
        println("----------------------")
    }

    fun calculateTotalPrice(): Double {
        var total = 0.0
        for (item in shoppingCart) {
            total += item.price
        }
        return total
    }

    fun clearCart() {
        shoppingCart.clear()
        println("Shopping cart cleared.")
    }

    fun checkout() {
        if (shoppingCart.isEmpty()) {
            println("Your shopping cart is empty.")
            return
        }

        val totalPrice = calculateTotalPrice()
        println("Total price: W$totalPrice")
        println("Thank you for your order. Payment successful!")
        clearCart()
    }
}