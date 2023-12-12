package exercise47

class Solution2 {
    fun solution(strings: Array<String>, n: Int) = strings.also {
        it.sort()
        it.sortBy { str -> str[n] }
    }
}