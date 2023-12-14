package level3.exercise55

class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var indexOfCards1 = 0
        var indexOfCards2 = 0

        for (word in goal) {
            if (indexOfCards1 < cards1.size && word == cards1[indexOfCards1]) indexOfCards1++
            else if (indexOfCards2 < cards2.size && word == cards2[indexOfCards2]) indexOfCards2++
            else return "No"
        }
        return "Yes"
    }
}