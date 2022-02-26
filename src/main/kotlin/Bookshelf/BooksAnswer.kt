import java.util.*

fun main(args:Array<String>,) {


    val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 545)


    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
}

open class Book(val title: String, val author: String, val yearWritten: Int, var pages: Int) {

    var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String,
            author: String,
            yearWritten: Int,
            pages: Int,
            var format: String = "text") : Book(title, author, yearWritten, pages) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}

fun Book.weight(): Double { return pages * 1.5}

fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

class Puppy() {
    fun playWithBook(book: Book) { book.tornPages(Random().nextInt(12))}
}
