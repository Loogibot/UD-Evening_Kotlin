package `Udacity Kotlin`

import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}
fun dayOfWeek() {
    println("What day is it today?")
    val weekDayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (weekDayOfWeek) {
        1 -> println("SUNDAY")
        2 -> println("MONDAY")
        3 -> println("TUESDAY")
        4 -> println("WEDNESDAY")
        5 -> println("THURSDAY")
        6 -> println("FRIDAY")
        7 -> println("SATURDAY")
    }
}