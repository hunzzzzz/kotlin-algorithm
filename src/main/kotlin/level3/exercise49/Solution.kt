package level3.exercise49

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var sumArray = intArrayOf()
        var sum: Int

        for (i in numbers.indices) {
            for (j in i + 1..numbers.size - 1) {
                sum = numbers[i] + numbers[j]
                if (!sumArray.contains(sum))
                    sumArray = sumArray.plus(sum)
            }
        }
        bubbleSort(sumArray)
        return sumArray
    }

    private fun bubbleSort(list: IntArray) {
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
}