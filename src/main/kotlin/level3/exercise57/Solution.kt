package level3.exercise57

class Member(index: Int, list: MutableList<Int>) {
    var memberIndex: Int
    var memberScore: Int
    private var pattern: MutableList<Int>

    init {
        this.memberIndex = index
        this.memberScore = 0
        this.pattern = list
    }

    fun repeatPattern(size: Int): MutableList<Int> {
        val repeatedPattern = mutableListOf<Int>()
        var count = 0

        while (true) {
            for (n in pattern) {
                repeatedPattern.add(n)
                count++
                if (count == size) return repeatedPattern
            }
        }
    }
}

class Solution {
    fun solution(answers: IntArray): IntArray {
        val member1 = Member(1, mutableListOf(1, 2, 3, 4, 5))
        val member2 = Member(2, mutableListOf(2, 1, 2, 3, 2, 4, 2, 5))
        val member3 = Member(3, mutableListOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))
        val memberList = mutableListOf(member1, member2, member3)

        val member1Pattern = member1.repeatPattern(answers.size)
        val member2Pattern = member2.repeatPattern(answers.size)
        val member3Pattern = member3.repeatPattern(answers.size)

        for (i in answers.indices) {
            if (answers[i] == member1Pattern[i]) member1.memberScore++
            if (answers[i] == member2Pattern[i]) member2.memberScore++
            if (answers[i] == member3Pattern[i]) member3.memberScore++
        }

        val maxScore = memberList.maxOf { it.memberScore }
        val answer = memberList.filter { it.memberScore == maxScore }.map { it.memberIndex }

        return answer.toIntArray()
    }
}