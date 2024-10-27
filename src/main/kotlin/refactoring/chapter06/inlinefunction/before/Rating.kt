package refactoring.chapter06.inlinefunction.before

import refactoring.chapter06.inlinefunction.Driver

fun rating(aDriver: Driver): Int {
    return if (moreThanFiveLateDeliveries(aDriver)) 2 else 1
}

fun moreThanFiveLateDeliveries(dvr: Driver): Boolean {
    return dvr.numberOfLateDeliveries > 5
}