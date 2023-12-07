package sort

fun main() {
    val numArray = arrayListOf(97, 115, 100, 102, 87, 68, 65, 113)

    val sort = QuickSort()
    sort.sortDescending(numArray)
    println(numArray)
}