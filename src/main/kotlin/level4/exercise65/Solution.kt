package level4.exercise65

class Solution {
    fun solution(s: String): Int {
        var ch = s[0]
        var strIndex = 0
        var sameCount = 0
        var diffCount = 0
        val wordList = mutableListOf<String>()

        for (i in s.indices) {
            if (sameCount != 0 && diffCount != 0 && sameCount == diffCount) {
                wordList.add(s.substring(strIndex, i))
                strIndex = i
                // 다시 초기화
                ch = s[strIndex]
                sameCount = 0
                diffCount = 0
            }
            if (s[i] == ch)
                sameCount++
            else diffCount++
        }

        wordList.add(s.substring(strIndex))
        return wordList.size
    }
}