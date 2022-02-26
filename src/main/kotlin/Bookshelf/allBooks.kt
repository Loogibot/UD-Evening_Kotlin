package Bookshelf

fun main(args: Array<String>) {

    val allBooks = setOf("Hamlet", "Othello", "A Midsummer's Night Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any {it.value.contains("Hamlet")})

    val moreBooks = mutableMapOf<String, String> ("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") {"Kipling"}
    moreBooks.getOrPut("Hamlet") {"Shakespeare"}
    println(moreBooks.size)

    val bookTest = Novel()
    val myBookList = bookTest.printUrl(moreBooks)

}

const val maxBooks = 12
const val BASE_URL = "https://"

class Novel() {

    fun canBorrow(moreBooks: MutableMap<String, String>): Boolean {
        val userBooks: Int = moreBooks.size
            return userBooks < maxBooks
    }

    fun printUrl(moreBooks: MutableMap<String, String>){

        val booksList = moreBooks.asIterable()

        for (i in booksList) {
            return println(BASE_URL + booksList.first() + ".com")
        }
    }
}
