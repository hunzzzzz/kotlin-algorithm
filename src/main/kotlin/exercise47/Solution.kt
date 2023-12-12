package exercise47

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var temp: String
        var min: String
        var indexOfMin: Int

        for (i in strings.indices) {
            min = strings[i]

            for (j in i..strings.size - 1) {
                if (strings[j][n].code < min[n].code) min = strings[j]
                else if (strings[j][n].code == min[n].code && compareTwoString(strings[j], min)) min = strings[j]
            }
            indexOfMin = strings.lastIndexOf(min)

            temp = strings[i]
            strings[i] = strings[indexOfMin]
            strings[indexOfMin] = temp
        }
        return strings
    }

    private fun compareTwoString(str1: String, str2: String): Boolean {
        val min = if (str1.length >= str2.length) str2 else str1 // 두 문자열 중 길이가 짧은 문자열
        for (i in min.indices) {
            if (str1[i].code < str2[i].code)
                return true
            else if (str1[i].code > str2[i].code)
                return false
        }
        return (str1.length >= str2.length)
    }
}