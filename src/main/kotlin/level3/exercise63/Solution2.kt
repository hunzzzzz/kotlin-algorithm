package level3.exercise63

import kotlin.math.min

class Solution2 {
    fun solution(X: String, Y: String): String {
        val answer = StringBuilder()

        for (i in 9 downTo 0)
            answer.append(
                i.toString().repeat(min(X.count { it == i.digitToChar() }, Y.count { it == i.digitToChar() }))
            )
        return if (answer.isEmpty()) "-1" else if (answer[0] == '0') "0" else answer.toString()
    }
}