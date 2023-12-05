package sort

fun main() {
    val sort = BubbleSort()
    val numArray = arrayListOf(5, 2, 3, 4, 1)

    sort.sortAscending(numArray)
    println(numArray)
}