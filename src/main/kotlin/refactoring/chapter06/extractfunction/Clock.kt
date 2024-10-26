package refactoring.chapter06.extractfunction

import java.time.LocalDate

class Clock {
    companion object {
        fun today(): LocalDate {
            return LocalDate.now()
        }
    }
}