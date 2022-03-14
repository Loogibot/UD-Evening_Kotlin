package `Udacity Kotlin`

fun longestEvenWord(sentence: String): String {

    val wordFilter = sentence.filter { it.isLetterOrDigit() || it.isWhitespace() }

    val wordSeparate: List<String> = wordFilter.split(" ").map { it.trim() }

    val wordByLengths = wordSeparate.sortedByDescending { it.length }

    val evenWords = wordByLengths.filter { it.length % 2 == 0 }

    if (evenWords.isEmpty()) {
        return "00"
    } else {
        return evenWords.first()
    }
}

fun main(args: Array<String>) {
    val sentence = readLine()!!

    val result = longestEvenWord(sentence)

    println(result)
}
