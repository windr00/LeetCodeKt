package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see <a href="https://leetcode.com/problems/search-insert-position/description/">35. Search Insert Position</a>
 */
fun Solution.searchInsert(nums: IntArray, target: Int): Int {
    if (target <= nums[0]) {
        return 0
    }
    for (i in 1 until nums.size) {
        if (nums[i] == target || (nums[i] > target && nums[i - 1] < target)) {
            return i
        }
    }
    return nums.size
}