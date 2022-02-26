package Bookshelf

fun main(args: Array<String>) {
    val newBook = novel("Loogz The Lost", "Luigi Mota", 2024)

    var newBookNames = newBook.names()
    var newBookNamesYear = newBook.namesAndYear()

    println(newBookNames)

    println("The book is called ${newBookNames.first} by ${newBookNames.second}, written in ${newBookNamesYear.third}")

}

class novel(val title: String, val author: String, val year: Int) {
    fun names(): Pair<String, String> {
        return (title to author)
    }

    fun namesAndYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}