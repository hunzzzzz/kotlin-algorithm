package sort

class BubbleSort : Sort {
    override fun sortAscending(list: ArrayList<Int>) {
        var temp = 0

        for (i in list.indices) {
            for (j in 0 until list.size - 1 - i) {
                if (list[j] > list[j + 1]) {
                    temp = list[j]
                    list[j] = list[j + 1]
                    list[j + 1] = temp
                }
            }
        }
    }

    override fun sortDescending(list: ArrayList<Int>) {
        var temp = 0

        for (i in list.indices) {
            for (j in 0 until list.size - 1) {
                if (list[j] < list[j + 1]) {
                    temp = list[j]
                    list[j] = list[j + 1]
                    list[j + 1] = temp
                }
            }
        }
    }
}