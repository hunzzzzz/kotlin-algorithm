package sort

class QuickSort : Sort {
    override fun sortAscending(list: ArrayList<Int>) {
        quickSort(list, 0, list.size - 1)
    }

    override fun sortDescending(list: ArrayList<Int>) {
        quickSortDesc(list, 0, list.size - 1)
    }

    private fun quickSort(list: ArrayList<Int>, start: Int, end: Int) {
        if (start >= end) return
        val midPoint = partition(list, start, end)

        quickSort(list, start, midPoint - 1)
        quickSort(list, midPoint + 1, end)
    }

    private fun quickSortDesc(list: ArrayList<Int>, start: Int, end: Int) {
        if (start >= end) return
        println("list: $list start: $start end: $end")
        val midPoint = partitionDesc(list, start, end)
        println("list: $list start: $start end: $end midpoint: $midPoint")
        quickSortDesc(list, start, midPoint - 1)
        quickSortDesc(list, midPoint + 1, end)
    }

    private fun partition(list: ArrayList<Int>, startIdx: Int, endIdx: Int): Int {
        var i = startIdx
        var j = endIdx
        var temp: Int
        val pivot = list[(i + j) / 2]

        while (i <= j) {
            while (list[i] < pivot) i++
            while (list[j] > pivot) j--
            if (i <= j) {
                temp = list[i]
                list[i] = list[j]
                list[j] = temp
                i++
                j--
            }
        }

        return list.indexOf(pivot)
    }

    private fun partitionDesc(list: ArrayList<Int>, startIdx: Int, endIdx: Int): Int {
        var i = startIdx
        var j = endIdx
        var temp: Int
        val pivot = list[(i + j) / 2]

        while (i <= j) {
            while (list[i] > pivot) i++
            while (list[j] < pivot) j--
            if (i <= j) {
                temp = list[i]
                list[i] = list[j]
                list[j] = temp
                i++
                j--
            }
        }

        return list.indexOf(pivot)
    }
}