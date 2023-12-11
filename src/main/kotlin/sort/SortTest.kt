package sort

fun main() {
    // intArrayOf(97, 115, 100, 102, 87, 68, 65, 113)
    val numArray = intArrayOf(2, 2, 2, 6, 2)

    val sort = SelectionSort()
    sort.sortAscending(numArray)
    println(numArray.contentToString())

    sort.sortDescending(numArray)
    println(numArray.contentToString())
}