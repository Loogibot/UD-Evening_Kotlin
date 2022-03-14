package `Udacity Kotlin`

fun main(args: Array<String>) {

    val canAddFish = fitMoreFish(10.0, mutableListOf(3, 3, 3))
    val canAddFish1 = fitMoreFish(8.0, mutableListOf(2, 2, 2), hasDecorations = false)
    val canAddFish2 = fitMoreFish(9.0, mutableListOf(1, 1, 3), 3)
    val canAddFish3 = fitMoreFish(10.0, mutableListOf(), 7, true)


    println(
        "Can you add fish to tank 1? : $canAddFish " +
                "\n Can you add fish to tank 2? : $canAddFish1 " +
                "\n Can you add fish to tank 3? : $canAddFish2 " +
                "\n Can you add fish to tank 4? : $canAddFish3"
    )
}

fun fitMoreFish(
    tankSize: Double,
    currentFish: MutableList<Int>,
    fishSize: Int = 0,
    hasDecorations: Boolean = true
): Boolean {

    if (hasDecorations) {
        tankSize * 0.8
    }
    if (fishSize.toDouble() + currentFish.sum() >= tankSize * 0.8) {
        return false
    }
    if (currentFish.sum() >= tankSize * 0.8) {
        return false
    }

    return true

}
