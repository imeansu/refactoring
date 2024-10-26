package refactoring.chapter06.extractfunction.before

import refactoring.chapter06.extractfunction.Clock
import refactoring.chapter06.extractfunction.Invoice

fun printOwing(invoice: Invoice) {
    var outstanding = 0

    println("***********************")
    println("**** 고객 채무 ****")
    println("***********************")

    // 미해결 채무(outstanding)를 계산한다.
    for (order in invoice.orders) {
        outstanding += order.amount
    }

    // 마감일(dueDate)을 기록한다.
    val today = Clock.today()
    invoice.dueDate = today.plusDays(30)

    // 세부 사항을 출력한다.
    println("고객명: ${invoice.customer}")
    println("채무액: $outstanding")
    println("마감일: ${invoice.dueDate}")
}