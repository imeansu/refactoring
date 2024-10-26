package refactoring.chapter06.extractfunction.after

import refactoring.chapter06.extractfunction.Clock
import refactoring.chapter06.extractfunction.Invoice

fun printOwing(invoice: Invoice) {
    printBanner()
    val outstanding = calculateOutstanding(invoice)
    recordDueDate(invoice)
    printDetails(invoice, outstanding)
}

private fun calculateOutstanding(invoice: Invoice): Int {
    var result = 0
    for (order in invoice.orders) {
        result += order.amount
    }
    return result
}

private fun recordDueDate(invoice: Invoice) {
    val today = Clock.today()
    invoice.dueDate = today.plusDays(30)
}

private fun printDetails(invoice: Invoice, outstanding: Int) {
    println("고객명: ${invoice.customer}")
    println("채무액: $outstanding")
    println("마감일: ${invoice.dueDate}")
}

private fun printBanner() {
    println("***********************")
    println("**** 고객 채무 ****")
    println("***********************")
}