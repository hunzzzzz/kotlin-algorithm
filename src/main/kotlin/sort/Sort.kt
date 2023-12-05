package sort

interface Sort {
    fun sortAscending(list: ArrayList<Int>): ArrayList<Int>
    fun sortDescending(list: ArrayList<Int>): ArrayList<Int>
}