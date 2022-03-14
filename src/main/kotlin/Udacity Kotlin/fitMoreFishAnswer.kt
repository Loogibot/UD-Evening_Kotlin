package `Udacity Kotlin`

fun main(args: Array<String>) {

    val canAddFish0 = canAddFish(10.0, mutableListOf(3, 3, 3))
    val canAddFish1 = canAddFish(8.0, mutableListOf(2, 2, 2), hasDecorations = false)
    val canAddFish2 = canAddFish(9.0, mutableListOf(1, 1, 3), 3)
    val canAddFish3 = canAddFish(10.0, mutableListOf(), 7, true)


    println(
        "Can you add fish to tank 1? : $canAddFish0 " +
                "\n Can you add fish to tank 2? : $canAddFish1 " +
                "\n Can you add fish to tank 3? : $canAddFish2 " +
                "\n Can you add fish to tank 4? : $canAddFish3"
    )
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}