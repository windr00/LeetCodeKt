package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see <a href="https://leetcode.com/problems/search-insert-position/description/">35. Search Insert Position</a>
 */
fun Solution.searchInsert(nums: IntArray, target: Int): Int {
    val length = nums.size
    for (i in 0 until length) {
        if (nums[i] >= target) {
            return i
        }
    }
    return length
}