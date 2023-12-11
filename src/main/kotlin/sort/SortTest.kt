package sort

fun main() {
    val numArray = intArrayOf(97, 115, 100, 102, 87, 68, 65, 113)

    val sort = SelectionSort()
    sort.sortAscending(numArray)
    println(numArray.contentToString())

    sort.sortDescending(numArray)
    println(numArray.contentToString())
}