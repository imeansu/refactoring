package refactoring.chapter06.inlinefunction.after

import refactoring.chapter06.inlinefunction.Driver

fun rating(aDriver: Driver): Int {
    return if (aDriver.numberOfLateDeliveries > 5) 2 else 1
}