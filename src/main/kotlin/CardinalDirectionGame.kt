fun main(args: Array<String>) {

    val game = Game()
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

enum class Directions {NORTH, SOUTH, EAST, WEST, START, END}

class Location(val width: Int, val height: Int) {
    val map = Array(width) { arrayOfNulls<String> (height)}

    init {
        map.forEach()
        }
}

class Game() {
    var path = mutableListOf<Directions>(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    val end = { path.add(Directions.END); println("Game Over: $path"); path.clear(); }

    fun move(where: () -> Boolean): Unit {
        where()
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

}