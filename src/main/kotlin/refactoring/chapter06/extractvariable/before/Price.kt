package refactoring.chapter06.extractvariable.before

import kotlin.math.max
import kotlin.math.min

fun price(quantity: Int, itemPrice: Int): Double {
    // 가격(price) = 기본 가격 - 수량 할인 + 배송비
    return quantity * itemPrice -
            max(0, quantity - 500) * itemPrice * 0.05 +
            min(quantity * itemPrice * 0.1, 100.0)
}