package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see <a href="https://leetcode.com/problems/pascals-triangle-ii/description/">119. Pascal's Triangle II</a>
 */

fun Solution.getRow(rowIndex: Int): List<Int> {
    if (rowIndex == 0) {
        return arrayListOf(1)
    }
    var stepArray = arrayListOf<Int>()
    (0 until rowIndex + 1).forEach { level ->
        val newArray = arrayListOf(1)
        (1 until level).forEach {
            newArray.add(stepArray[it - 1] + stepArray[it])
        }
        stepArray = newArray
        if (level != 0) {
            stepArray.add(1)
        }
    }
    return stepArray
}