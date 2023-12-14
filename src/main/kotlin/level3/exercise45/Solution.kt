package level3.exercise45

class Solution {
    fun solution(s: String, n: Int): String {
        val alphabetLower = arrayListOf<Char>()
        val alphabetUpper = arrayListOf<Char>()
        val newStr = StringBuilder()

        for (i in 1..26) {
            alphabetLower.add((96 + i).toChar())
            alphabetUpper.add((64 + i).toChar())
        }

        var index = 0

        for (ch in s) {
            if (ch.isUpperCase()) {
                index = (alphabetUpper.indexOf(ch) + n) % 26
                newStr.append(alphabetUpper[index])
            } else if (ch.isLowerCase()) {
                index = (alphabetLower.indexOf(ch) + n) % 26
                newStr.append(alphabetLower[index])
            } else newStr.append(ch)
        }

        return newStr.toString()
    }
}