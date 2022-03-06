package Aquarium

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("`Udacity Kotlin`.swim")
    }
}

interface FishAction {
    fun eat()
}

abstract class AquariumFish: FishAction {

    abstract val color: String
    override fun eat() = println("yum")
}

