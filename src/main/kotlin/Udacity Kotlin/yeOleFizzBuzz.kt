package `Udacity Kotlin`

fun fizzBuzz(n: Int): Unit {
    for (i in 1..n) {
        if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")

        } else {
            println(i)
        }
        if (i % 5 == 0 && i % 3 == 0) {
            println("FizzBuzz")
        }
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    fizzBuzz(n)
}
