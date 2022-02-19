fun main(args: Array<String>) {

    val Illiad = eBooks("Illiad", "Homer")
    val Oddesey = eBooks("Oddesey", "Homer")
    
    println(" ${Illiad.author} wrote ${Illiad.title}" )

}

open class Books(var title: String,var author: String) {

    var currentPage: Int = 1

    open fun readPage() {
        currentPage++
    }

}

class eBooks(title: String, author: String): Book(title, author) {

    var text: String = ""

//    override fun readPage() : Int {
//        return currentPage + 250
//    }

}