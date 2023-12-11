package sort

class SelectionSort : Sort {
    override fun sortAscending(list: IntArray) {
        var temp: Int
        var min: Int
        var indexOfMin: Int

        for (i in list.indices) {
            min = list[i]

            for (j in i..list.size - 1)
                if (list[j] < min) min = list[j]

            indexOfMin = list.lastIndexOf(min)

            temp = list[i]
            list[i] = list[indexOfMin]
            list[indexOfMin] = temp
        }
    }

    override fun sortDescending(list: IntArray) {
        var temp: Int
        var max: Int
        var indexOfMax: Int

        for (i in list.indices) {
            max = list[i]

            for (j in i..list.size - 1) {
                if (list[j] > max) max = list[j]
            }
            indexOfMax = list.lastIndexOf(max)

            temp = list[i]
            list[i] = list[indexOfMax]
            list[indexOfMax] = temp
        }
    }
}