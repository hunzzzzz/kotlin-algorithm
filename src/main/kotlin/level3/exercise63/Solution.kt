package level3.exercise63

class Solution {
    fun solution(X: String, Y: String): String {
        // {숫자: 개수}
        val mapOfX = mutableMapOf<Int, Int>()
        val mapOfY = mutableMapOf<Int, Int>()
        for (ch in X) {
            if (mapOfX.containsKey(ch.digitToInt()))
                mapOfX[ch.digitToInt()] = mapOfX[ch.digitToInt()]!! + 1
            else
                mapOfX[ch.digitToInt()] = 1
        }
        for (ch in Y) {
            if (mapOfY.containsKey(ch.digitToInt()))
                mapOfY[ch.digitToInt()] = mapOfY[ch.digitToInt()]!! + 1
            else
                mapOfY[ch.digitToInt()] = 1
        }

        val list = mutableListOf<String>()
        for (i in 0..9) {
            if (!mapOfX.containsKey(i) || !mapOfY.containsKey(i))
                continue
            else {
                if (mapOfX[i]!! <= mapOfY[i]!!)
                    list.add(i.toString().repeat(mapOfX[i]!!))
                else
                    list.add(i.toString().repeat(mapOfY[i]!!))
            }
        }
        list.sortDescending()
        return if (list.isEmpty()) "-1" else if (list[0][0] == '0') "0" else list.joinToString("")
    }
}

fun main() {
    val sol = Solution()
    println(sol.solution("12321", "42531"))
}