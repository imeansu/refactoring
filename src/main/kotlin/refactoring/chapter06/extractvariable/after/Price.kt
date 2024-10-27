package refactoring.chapter06.extractvariable.after

import kotlin.math.max
import kotlin.math.min

fun price(order: Order): Double {
    val basePrice = order.quantity * order.itemPrice
    val quantityDiscount = max(0, order.quantity - 500) * order.itemPrice * 0.05
    val shipping = min(order.quantity * order.itemPrice * 0.1, 100.0)
    return basePrice - quantityDiscount + shipping
}