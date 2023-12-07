package exercise34

class Solution {
    fun solution(s: String): String {
        val numList = arrayListOf<Int>()
        for (ch in s) {
            numList.add(ch.code)
        }

        sortDescending(numList)

        val answer = StringBuilder()
        for (num in numList)
            answer.append(num.toChar())
        return answer.toString()
    }

    private fun sortDescending(list: ArrayList<Int>) {
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