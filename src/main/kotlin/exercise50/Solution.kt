package exercise50

class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        val map = mutableMapOf<Char, Int>() // {문자: 인덱스}

        for (i in s.indices) {
            if (!map.containsKey(s[i])) {
                answer = answer.plus(-1)
                map[s[i]] = i
            } else {
                answer = answer.plus(i - map[s[i]]!!)
                map[s[i]] = i
            }
        }
        return answer
    }
}