package `Udacity Kotlin`

fun main(args: Array<String>) {

    val userMood = readLine()!!
    println(whatShouldIDo(userMood))

}

fun whatShouldIDo(mood: String, weather: String = "sunny", temperature: Int = 24): String {

    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read"
    }

}