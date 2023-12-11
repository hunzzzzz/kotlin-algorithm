package exercise46

class Solution {
    fun solution(s: String): Int {
        var str = s
        val numMap = mutableMapOf<Int, String>()
        numMap[0] = "zero"
        numMap[1] = "one"
        numMap[2] = "two"
        numMap[3] = "three"
        numMap[4] = "four"
        numMap[5] = "five"
        numMap[6] = "six"
        numMap[7] = "seven"
        numMap[8] = "eight"
        numMap[9] = "nine"

        for (num in numMap) {
            while (str.contains(num.value)) {
                str = str.replace(num.value, num.key.toString())
            }
        }

        return Integer.parseInt(str)
    }
}