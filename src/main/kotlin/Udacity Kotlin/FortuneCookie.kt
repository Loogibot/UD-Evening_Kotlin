package `Udacity Kotlin`

fun main(args: Array<String>) {
    print("Your fortune is: ${grabFortuneCookie()}")
}

fun grabFortuneCookie(): String {
    val fortuneList = listOf(
        "You will have a great day!", "Things will go well for you today.",
        "Enjoy a wonderful day of success.", "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    val fortuneSize = fortuneList.size

    print("Enter your birthday: ")

    var birthday = readLine()!!.toIntOrNull()
    var newBirthday = 1
    birthday ?: newBirthday

    return fortuneList[birthday?.rem(fortuneSize)!!]

}