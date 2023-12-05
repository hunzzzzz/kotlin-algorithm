package exercise20

class Solution {
    fun solution(n: Long): Long {
        val numArray = n.toString().toCharArray()

        for (i in numArray.indices) {
            for (j in 0 until numArray.size - 1 - i) {
                if (Integer.parseInt(numArray[j].toString()) < Integer.parseInt(numArray[j + 1].toString())) {
                    var temp = ' '
                    temp = numArray[j]
                    numArray[j] = numArray[j + 1]
                    numArray[j + 1] = temp
                }
            }
        }

        return String(numArray).toLong()
    }
}