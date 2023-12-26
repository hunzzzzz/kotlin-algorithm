package level4.exercise72

class Solution {

    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val rankMap = mutableMapOf<String, Int>()
        var follower: String // 잡힌 사람
        var temp: String

        // {이름: 등수}
        for (i in players.indices)
            rankMap[players[i]] = i + 1

        // call = 잡는 사람
        for (call in callings) {
            follower = players[rankMap[call]!! - 2]

            // 잡는 사람과 잡힌 사람을 교체
            temp = players[rankMap[call]!! - 1]
            players[rankMap[call]!! - 1] = players[rankMap[call]!! - 2]
            players[rankMap[call]!! - 2] = temp

            // rankMap의 등수도 변경
            rankMap[call] = rankMap[call]!! - 1
            rankMap[follower] = rankMap[follower]!! + 1
        }

        return players
    }
}