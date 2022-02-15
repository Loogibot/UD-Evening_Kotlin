fun main(args: Array<String>) {
    var fortune: String = ""

    while (!fortune.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune");
    }
}

fun getBirthday(): Int {

    print("Enter your birthday: ")
    var birthday = readLine()!!.toIntOrNull() ?: 1

    return when (birthday) {
        in 1..300 -> 6
        in 301..450 -> 5
        in 451..600 -> 4
        in 601..750 -> 3
        in 751..1000 -> 2
        in 1001..1231 -> 1
        else -> 0
    }

}

fun getFortune (x: Int) :  String {
    val fortunes = listOf( "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")

    return fortunes[x]

}