import java.util.*

fun isPalindrome(s: String): Boolean {

    s.lowercase(Locale.getDefault())

        .let { it == it.reversed() }
    return true

}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = isPalindrome(s)

    println(if (result) 1 else 0)
}