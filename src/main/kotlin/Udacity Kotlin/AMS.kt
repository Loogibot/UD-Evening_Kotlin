package `Udacity Kotlin`

import java.util.*

fun main(args: Array<String>) {
    println("Feeding time with ${args[0]}, dammit!")
    feedTheFish()

    var bubbles = 0
    while (bubbles < 50) {
        bubbles += 8
        println(bubbles)
    }

    repeat(4) {
        println("A fish is swimming, magically")
    }

    eagerExample()
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic", "plastic plant", "alligator", "flowerpot")

    val eager = decorations.filter {it[0] == 'p'} // 'x' will iterate over each it with that char
    println(eager)

    val solid = decorations.filter {it == ""} // will assign
    println(solid)

    val filtered = decorations.asSequence().filter { it[0] == 'p'}
    println(filtered)
    println(filtered.toList())
    
    val lazyMap = decorations.asSequence().map {
        println("map: $it")
    }

    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")
    println("some: ${lazyMap.asIterable()}")

}

fun getDirtySensorReading() = 20

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading()
) : Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater2(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20) : Boolean {
    return false
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 30)
    shouldChangeWater2(day = "Monday")

    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
    
    swim(5,"slow")

    dirtyProcessor()
}

var dirty = 20
val waterFilter = {dirty: Int -> dirty/2}
val waterFilter1: (Int) -> Int = { dirty -> dirty / 2}

fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty) { dirty -> dirty + 50}

}

fun swim(time: Int, speed: String = "fast") {
    println("Swimming $speed")
}

fun randomDay() : String {
    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood (day: String) : String {
    var food = "fasting"

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thurday" -> "granules"
        "Friday" -> "mosquitos"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"

    }
}
