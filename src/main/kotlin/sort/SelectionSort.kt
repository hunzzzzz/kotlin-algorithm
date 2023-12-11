package sort

class SelectionSort : Sort {
    override fun sortAscending(list: IntArray) {
        var temp = 0
        var min = list[0]
        var indexOfMin: Int

        for (i in list.indices) {
            for (j in i..list.size - 1) {
                if (list[j] < min) min = list[j]
            }
            indexOfMin = list.indexOf(min)

            temp = list[i]
            list[i] = list[indexOfMin]
            list[indexOfMin] = temp

            if (i != list.size - 1)
                min = list[i + 1]
        }
    }

    override fun sortDescending(list: IntArray) {
        var temp = 0
        var max = list[0]
        var indexOfMax: Int

        for (i in list.indices) {
            for (j in i..list.size - 1) {
                if (list[j] > max) max = list[j]
            }
            indexOfMax = list.indexOf(max)

            temp = list[i]
            list[i] = list[indexOfMax]
            list[indexOfMax] = temp

            if (i != list.size - 1)
                max = list[i + 1]
        }
    }
}