package Aquarium

abstract class AquariumFishes {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plescostomus: AquariumFish(), FishActions {
    override val color = "gold"
    override fun eat() {
        println("munch on algae")
    }
}

interface FishActions {
    fun eat()
}