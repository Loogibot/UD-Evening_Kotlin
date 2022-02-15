fun main() {
    var currySpice = SimpleSpice()
    currySpice.name = "curry"
    currySpice.spiciness = "curry"

    println("Your spice is ${currySpice.name} with a spiciness of ${currySpice.spiciness}")
}

class SimpleSpice {
    var name: String = ""
    var spiciness: String = ""

    var heat: Int
        get() = spiciness
        set(value) {5}


}
