fun main() {
    var currySpice = SimpleSpice()
    currySpice.name = "curry"
    currySpice.spiciness = "mild"


    println("Your spice is ${currySpice.name} with a spiciness of ${currySpice.heat}")
}

class SimpleSpice {
    var name: String = ""
    var spiciness: String = ""

    val heat: Int
        get() {return 5}
}

class  Spices(val name: String, spiciness: String = "mild") {

    val Spices = listOf(Spice("curry", "mild"),
        Spice("jalapeno", "hot"),
        Spice("cinnamon", "sweet?"))

}