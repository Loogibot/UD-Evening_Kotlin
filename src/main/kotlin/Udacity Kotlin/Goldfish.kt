package `Udacity Kotlin`

fun main(args: Array<String>) {
    println("Finally! Good evening to us ${args[0]}, dammit!")
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = temperature > 50
    println(isHot)

    val message = "You are ${if (temperature > 50) "fried" else "safe"} fish"
    println(message)
}
