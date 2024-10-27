package refactoring.chapter06.extractvariable.after

import kotlin.math.max
import kotlin.math.min

data class Order(
    val quantity: Int,
    val itemPrice: Int
) {
    fun price(): Double {
        return basePrice() - quantityDiscount() + shipping()
    }

    private fun basePrice() = quantity * itemPrice
    private fun quantityDiscount() = max(0, quantity - 500) * itemPrice * 0.05
    private fun shipping() = min(quantity * itemPrice * 0.1, 100.0)
}