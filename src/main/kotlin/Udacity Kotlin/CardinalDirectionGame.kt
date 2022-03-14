package `Udacity Kotlin`

fun main(args: Array<String>) {

    val game = Game()
    game.grid
    // println(game.path)
    // game.north()
    // game.south()
    // game.east()
    // game.west()
    // game.end()
    // println(game.path)

    while (true) {
        println("Enter a direction: n/s/e/w")
        val input = readLine()
        game.makeMove(input)
        println(game.path)
    }
}

enum class Directions { NORTH, SOUTH, EAST, WEST, START, END }

class Location(val width: Int, val height: Int) {
    val map = Array(width) { arrayOfNulls<String>(height) }

    val h = height - 1
    val w = width - 1

    val trap = "TRAP"
    val treasure = "TREASURE"

    init {
        map[0][0] = Directions.START.toString()

        map[w][0] = trap
        map[w][h / 2] = trap
        map[w / 2][h] = trap

        map[w - 1][h / 2] = treasure
        map[w / 2][h - 1] = treasure

        map[w][h] = Directions.END.toString()

        println(map)
    }
}

class Game {
    var path = mutableListOf<Directions>(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    val end = { path.add(Directions.END); println("`Udacity Kotlin`.Game Over: $path"); path.clear(); }

    fun move(where: () -> Boolean): Unit {
        where()
        updateLocation()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> end
        }
    }

    val grid = Location(4, 4)

    fun updateLocation() {


    }

}

