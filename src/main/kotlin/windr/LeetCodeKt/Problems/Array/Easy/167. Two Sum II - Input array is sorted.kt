package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution


/**
 * @see <a href = "https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">167. Two Sum II - Input array is sorted</a>
 */
fun Solution.twoSum2(numbers : IntArray, target : Int) : IntArray {
    var idx1 = -1
    var idx2 = -1
    var low = 0
    var high = Math.ceil(numbers.size / 2.0).toInt() - 1
    if (numbers[high] > target) {

    }
    return intArrayOf(idx1, idx2)
}