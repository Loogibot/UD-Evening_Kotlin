fun main(args: Array<String>) {
    getFortuneCookie()

    print("Your fortune is: ")
}

fun getFortuneCookie() : String {
    val fortuneList = listOf("You will have a great day!","Things will go well for you today.",
        "Enjoy a wonderful day of success.","Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    val fortuneSize = fortuneList.size

    print("Enter your birthday: ")

    var birthday: Int? = readLine()!!.toIntOrNull()
    var newBirthday = 1
    birthday ?: newBirthday

    var fortuneBirthday = fortuneList(birthday/fortuneSize)

    return fortuneList[fortuneBirthday]

    }
}