package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import kotlin.math.ceil


/**
 * @see <a href = "https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">167. Two Sum II - Input array is sorted</a>
 */
fun Solution.twoSum2(numbers : IntArray, target : Int) : IntArray {
    val targetHalf=  target / 2
    var targetIndex = 0
    var targetHalfIndex = 0
    for (a in 0 .. numbers.size) {
        val i = numbers.size - a - 1
        if (targetHalf >= numbers[i] && targetHalf <= numbers[i - 1]) {
            targetHalfIndex = i
        }
        if (target <= numbers[i]) {
            targetIndex = i
        }
        if (target >= numbers[i]) {
            break
        }
    }
    for (idx1 in (0 .. targetHalfIndex)) {
        for (idx2 in (targetHalfIndex .. targetIndex)) {
            if (numbers[idx1] + numbers[idx2] == target) {
                return intArrayOf(idx1 + 1, idx2 + 1)
            }
        }
    }
    return intArrayOf(0, 0)
}