package level3.exercise61

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        // {당첨 번호 개수 : 순위}
        val lottoMap = mutableMapOf(0 to 6, 1 to 6, 2 to 5, 3 to 4, 4 to 3, 5 to 2, 6 to 1)
        var maxCount = 0
        var minCount = 0

        for (i in lottos.indices) {
            if (lottos[i] == 0)
                maxCount++
            else if (win_nums.contains(lottos[i])) {
                maxCount++
                minCount++
            }
        }

        return intArrayOf(lottoMap[maxCount]!!, lottoMap[minCount]!!)
    }
}