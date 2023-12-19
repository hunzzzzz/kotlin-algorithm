package level3.exercise64

fun main() {
    val sol = Solution()
    println(sol.solution(5, intArrayOf(5), intArrayOf(4))) // 5
    println(sol.solution(4, intArrayOf(2), intArrayOf(1, 2))) // 4
    println(sol.solution(5, intArrayOf(4, 2), intArrayOf(3, 5))) // 5
    println(sol.solution(5, intArrayOf(4, 5), intArrayOf(3, 4))) // 4
    println(sol.solution(5, intArrayOf(2, 3), intArrayOf(3, 4))) // 4
    println(sol.solution(5, intArrayOf(4, 5), intArrayOf(3, 4))) // 4
    println(sol.solution(10, intArrayOf(4, 7), intArrayOf(1, 6, 8))) // 9
    println(sol.solution(3, intArrayOf(1, 2, 3), intArrayOf(1, 2, 3))) // 3
    println(sol.solution(7, intArrayOf(1, 3, 5, 7), intArrayOf(1, 3, 5, 7))) // 7
}

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var lostStudent = 0
        val lostStudentList = lost.toMutableList()
        val reserveStudentList = reserve.toMutableList()
        val duplicateStudent = mutableListOf<Int>()

        // 여벌 체육복을 가져온 학생이 체육복을 도난당한 경우 → 리스트에서 제거하고 시작
        for (num in lost) {
            if (reserveStudentList.contains(num)) {
                lostStudentList.remove(num)
                reserveStudentList.remove(num)
            }
        }

        // [1차 분배]
        for (num in lostStudentList) {
            when {
                num - 1 in reserveStudentList && num + 1 in reserveStudentList -> duplicateStudent.add(num)
                num - 1 in reserveStudentList -> reserveStudentList.remove(num - 1)
                num + 1 in reserveStudentList -> reserveStudentList.remove(num + 1)
                else -> lostStudent++
            }
        }

        // [2차 분배] 앞, 뒤 번호가 모두 여벌 체육복이 있던 학생들에 대한 재배분
        for (num in duplicateStudent) {
            when {
                num - 1 in reserveStudentList -> reserveStudentList.remove(num - 1)
                num + 1 in reserveStudentList -> reserveStudentList.remove(num + 1)
                else -> lostStudent++
            }
        }

        return n - lostStudent
    }
}