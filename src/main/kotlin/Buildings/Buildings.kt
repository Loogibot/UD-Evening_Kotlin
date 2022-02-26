package Buildings

fun main(args: Array<String>) {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
}

open class BaseBuildingMaterials (val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterials(4)
class Brick : BaseBuildingMaterials(8)



class Building<T: BaseBuildingMaterials>(val baseMaterials: T) {

    val baseMaterialsNeeded = 100

    val actualMaterialsNeeded = baseMaterialsNeeded * baseMaterials.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${baseMaterials::class.simpleName} required")

    }
}