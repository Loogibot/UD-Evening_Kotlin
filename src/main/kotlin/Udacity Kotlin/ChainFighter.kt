package `Udacity Kotlin`

fun main(args: Array<String>) {

    val opponentMove = MoveAvailable(3)
    val opponentChoice = opponentMove.moveCycle()

    val playerMove = MoveAvailable(1)
    val playerChoice = playerMove.moveCycle()

    val drawPlayerMove = when (playerChoice.name) {
        "kick" -> "kick"
        "punch" -> "punch"
        "dodge" -> "dodge"
        "grab" -> "grab"
        else -> "shield"
    }

    println(drawPlayerMove)
    println(opponentChoice)
}

data class Move(val name: String, val damage: Int, val firstAdv: String, val secondAdv: String) {
}

class MoveAvailable(private val movePos: Int) {

    val kick = Move("kick",25, "punch", "shield")
    val grab = Move("grab",5, "kick", "shield")
    val dodge = Move("dodge",0, "kick", "grab")
    val shield = Move("shield",5, "punch", "dodge")
    val punch = Move("punch",15, "grab", "dodge")

    val allMoves = listOf(kick,grab,dodge,shield,punch)

    fun moveCompare(player: String, opponent: String) {
        if (player == opponent) {
            return
        }
    }

    fun moveCycle(): Move {
        return when (movePos) {
            1 -> allMoves.random()
            2 -> allMoves.random()
            else -> allMoves.random()
        }
    }
}
