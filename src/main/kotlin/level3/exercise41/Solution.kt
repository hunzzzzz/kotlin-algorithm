package level3.exercise41

class Solution {
    fun solution(s: String): String {
        val newString = StringBuilder()
        var index = 0

        for (i in s.indices) {
            if (index % 2 == 0)
                newString.append(s[i].uppercase())
            else
                newString.append(s[i].lowercase())

            index++
            if (s[i] == ' ')
                index = 0

        }
        return newString.toString()
    }
}