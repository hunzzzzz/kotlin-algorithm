package level4.exercise73

class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val rowSize = park.size // 가로 길이
        val colSize = park[0].length // 세로 길이
        var rowIndex = 0 // 현재 가로 인덱스
        var colIndex = 0 // 현재 세로 인덱스

        // 시작 위치 파악
        for (i in park.indices) {
            for (j in park[i].indices) {
                if (park[i][j] == 'S') {
                    rowIndex = i
                    colIndex = j
                }
            }
        }

        var direction: String
        var step: Int

        for (op in routes) {
            direction = op.split(" ")[0]
            step = Integer.parseInt(op.split(" ")[1])

            when (direction) {
                "E" -> if (colIndex + step < colSize && !hasObstacleInPath(park, rowIndex, colIndex, step, direction)) colIndex += step
                "W" -> if (colIndex - step >= 0 && !hasObstacleInPath(park, rowIndex, colIndex, step, direction)) colIndex -= step
                "S" -> if (rowIndex + step < rowSize && !hasObstacleInPath(park, rowIndex, colIndex, step, direction)) rowIndex += step
                "N" -> if (rowIndex - step >= 0 && !hasObstacleInPath(park, rowIndex, colIndex, step, direction)) rowIndex -= step
            }
        }

        return intArrayOf(rowIndex, colIndex)
    }

    private fun hasObstacleInPath(park: Array<String>, row: Int, col: Int, step: Int, direction: String): Boolean {
        when (direction) {
            "E" -> for (i in col..col + step) if (park[row][i] == 'X') return true
            "W" -> for (i in col downTo col - step) if (park[row][i] == 'X') return true
            "S" -> for (i in row..row + step) if (park[i][col] == 'X') return true
            "N" -> for (i in row downTo row - step) if (park[i][col] == 'X') return true
        }
        return false
    }
}