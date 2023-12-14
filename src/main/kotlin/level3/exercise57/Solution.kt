package level3.exercise57

class Member(index: Int, list: MutableList<Int>) {
    var memberIndex: Int
    var memberScore = 0
    private var pattern = mutableListOf<Int>()

    init {
        this.memberIndex = index
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
        val memberList = mutableListOf<Member>(member1, member2, member3)

        for (i in answers.indices) {
            if (answers[i] == member1.repeatPattern(answers.size)[i]) member1.memberScore++
            if (answers[i] == member2.repeatPattern(answers.size)[i]) member2.memberScore++
            if (answers[i] == member3.repeatPattern(answers.size)[i]) member3.memberScore++
        }

        var answer = intArrayOf()
        val maxScore = memberList.maxOf { it.memberScore }

        for (member in memberList) {
            if (member.memberScore == maxScore)
                answer = answer.plus(member.memberIndex)
        }

        return answer
    }
}