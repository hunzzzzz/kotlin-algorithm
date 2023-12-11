package extra.extra2

/*
프로그래머스 : 최빈값 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120812
*/
class Solution {
    fun solution(array: IntArray): Int {
        // {값: 빈도수}
        val numMap = mutableMapOf<Int, Int>()
        for (num in array) {
            if (numMap.containsKey(num))
                numMap[num] = numMap[num]!! + 1
            else
                numMap[num] = 1
        }

        // 최대 빈도수
        var max = 0
        for (value in numMap.values)
            if (value > max) max = value

        // 최대 빈도수에 해당하는 key값(최빈값) 저장
        val keys = arrayListOf<Int>()
        for (map in numMap)
            if (map.value == max)
                keys.add(map.key)

        return if (keys.size > 1) -1 else keys[0]
    }
}