package level4.exercise67

class Solution {
    companion object {
        const val ALPHABET_MAXIMUM = 26
        const val CODE_OF_LOWER_A = 97
    }

    fun solution(s: String, skip: String, index: Int): String {
        var loopCount: Int
        var increasedNum: Int
        var changedCharCode = 0
        val answer = StringBuilder()

        for (i in s.indices) {
            loopCount = 0
            increasedNum = 1
            while (loopCount != index) {
                changedCharCode = (s[i].code + increasedNum - CODE_OF_LOWER_A) % ALPHABET_MAXIMUM + CODE_OF_LOWER_A
                if (!skip.contains(changedCharCode.toChar())) loopCount++
                increasedNum++
            }
            answer.append(changedCharCode.toChar())
        }
        return answer.toString()
    }
}

fun main() {
    val sol = Solution()
    println(sol.solution("a", "bcdefghijk", 20))
}