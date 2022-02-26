package Aquarium.generics

fun main(args: Array<String>) {
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean) {}

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater :  WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

// generic class
class Aquarium<T: WaterSupply>(val waterSupply: T ) {

    fun addWater() {
        check(!waterSupply.needsProcessed) {"water supply needs processed"}

        println("adding water from $waterSupply")
    }

}
/* 'class Aquarium<T>(val waterSupply: T )'
*  would take in any type, like <T: Any>
*

* this creates an aquarium from the Aquarium generic class above,
* which takes in TapWater class as a property for waterSupply, which
* inherits from WaterSupply open class. NOTE that you need to pass a function
* as an argument for the aquarium instance, in this case it automatically
* creates TapWater(). Then we call the addChemicalCleaners() method from
* the TapWater class by first invoking waterSupply from Aquarium
*
*
*/

fun genericExample() {

    val aquarium = Aquarium<TapWater>(TapWater())
    /* this can also be expressed as 'val aquarium = Aquarium(TapWater())'
    * since Kotlin has type inference, and it knows which class/type its creating
    * with the generic, like with aquarium2 below
    */
    aquarium.waterSupply.addChemicalCleaners()
    println(aquarium.waterSupply)

    val aquarium1 = Aquarium(LakeWater())
    aquarium1.waterSupply.filter()
    aquarium1.addWater()

    // this will print string, since it simply puts 'string' into waterSupply of class Aquarium
    // 'val aquarium2 = Aquarium("string")
    // println(aquarium2.waterSupply)'

    // even null works

    // 'val aquarium3 = Aquarium(null)
    // println(aquarium3.waterSupply)'
}