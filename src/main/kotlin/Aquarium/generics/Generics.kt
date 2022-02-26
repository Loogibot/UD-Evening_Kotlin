package Aquarium

// without Generics, we would need to create a new class list for each type, Int, Short, Char, String and so on

class MyIntList {
    fun get(pos: Int): Int {return 0}
    fun addItem(item: Int) {}
}

class MyShortList {
    fun get(pos: Int): Short {return 0}
    fun addItem(item: Short) {}
}

// Generics lets you take in any type. <T> is the standard, but you can use anything else

class MyList<T> {
    fun get(pos: Int): T {
        TODO("implement")
    }
    fun addItem(item: T) {}
}

fun workWithMyList() {

    val intList: MyList<String>
    val fishList: MyList<Fish>
}