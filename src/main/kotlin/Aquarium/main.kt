package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
    fishExample()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}, " +
            "Width: ${myAquarium.width}, " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("My Aquarium specs: Height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(20,15,30)
    val smallAquarium2 = Aquarium(100,20,40)

    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium for ${(myAquarium2.water)/8} fish : ${myAquarium2.volume} liters with " +
            "length ${myAquarium2.length} " +
            "width ${myAquarium2.width} " +
            "height ${myAquarium2.height}")


}
