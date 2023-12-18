package level3.exercise63

import kotlin.math.min

class Solution2 {
    fun solution(X: String, Y: String): String {
        val answer = StringBuilder()

        for (ch in 9 downTo 0)
            answer.append(
                ch.toString().repeat(min(X.count { it == ch.digitToChar() }, Y.count { it == ch.digitToChar() }))
            )
        return if (answer.isEmpty()) "-1" else if (answer[0] == '0') "0" else answer.toString()
    }
}