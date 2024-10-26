package refactoring.chapter06.extractfunction

import java.time.LocalDate

data class Invoice(
    val customer: String,
    val orders: List<Order>,
    var dueDate: LocalDate
)