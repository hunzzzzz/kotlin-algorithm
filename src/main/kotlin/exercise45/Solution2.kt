package exercise45

class Solution2 {
    fun solution(s: String, n: Int): String {
        val newStr = StringBuilder()

        for (ch in s) {
            when (ch) {
                in 'A'..'Z' -> newStr.append('A' + (ch.code - 'A'.code + n) % 26)
                in 'a'..'z' -> newStr.append('a' + (ch.code - 'a'.code + n) % 26)
                else -> newStr.append(ch)
            }
        }
        return newStr.toString()
    }
}