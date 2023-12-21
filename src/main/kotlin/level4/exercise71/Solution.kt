package level4.exercise71

import java.time.LocalDate

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        today.split(".")
        val todayDate = LocalDate.of(
            today.split(".")[0].toInt(), today.split(".")[1].toInt(), today
                .split(".")[2].toInt()
        )
        val termsMap = mutableMapOf<String, Int>() // {"A" : 12}
        for (term in terms)
            termsMap[term.split(" ")[0]] = term.split(" ")[1].toInt()

        val answerList = mutableListOf<Int>()
        var privacyDate: LocalDate

        for (i in privacies.indices) {
            privacyDate = LocalDate.of(
                privacies[i].split(" ")[0].split(".")[0].toInt(),
                privacies[i].split(" ")[0].split(".")[1].toInt(),
                privacies[i].split(" ")[0].split(".")[2].toInt()
            )
            if (todayDate >= privacyDate.plusMonths(termsMap[privacies[i].split(" ")[1]]!!.toLong()))
                answerList.add(i + 1)
        }

        return answerList.toIntArray()
    }
}