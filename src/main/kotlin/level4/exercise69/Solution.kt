package level4.exercise69

class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val answer = StringBuilder()
        val map =
            mutableMapOf('R' to 0, 'T' to 0, 'C' to 0, 'F' to 0, 'J' to 0, 'M' to 0, 'A' to 0, 'N' to 0)
        val pairList = arrayListOf(Pair('R', 'T'), Pair('C', 'F'), Pair('J', 'M'), Pair('A', 'N'))

        for (i in survey.indices) {
            when (choices[i]) {
                1, 2, 3 -> {
                    if (map.containsKey(survey[i][0]))
                        map[survey[i][0]] = map[survey[i][0]]!! + (4 - choices[i])
                }

                5, 6, 7 -> {
                    if (map.containsKey(survey[i][1]))
                        map[survey[i][1]] = map[survey[i][1]]!! + (choices[i] - 4)
                }
            }
        }

        for (pair in pairList) {
            if (map[pair.first]!! >= map[pair.second]!!)
                answer.append(pair.first)
            else if (map[pair.first]!! < map[pair.second]!!)
                answer.append(pair.second)
        }

        return answer.toString()
    }
}