package Buildings

fun main(args: Array<String>) {
    val woodBuilding = Building(Wood())

    woodBuilding.build()
    isSmallBuilding(woodBuilding)
    isSmallBuilding(Building(Brick()))
}

open class BaseBuildingMaterials (val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterials(4)
class Brick : BaseBuildingMaterials(8)

fun <T: BaseBuildingMaterials> isSmallBuilding(building : Building<T>) {

    if (building.actualMaterialsNeeded > 500) println("large building") else println("small building")
}

class Building<out T: BaseBuildingMaterials>(val baseMaterials: T) {

    val baseMaterialsNeeded = 100

    val actualMaterialsNeeded = baseMaterialsNeeded * baseMaterials.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${baseMaterials::class.simpleName} required")

    }
}