package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">1. Remove Duplicates from Sorted Array</a>
 */
fun Solution.removeDuplicates(nums: IntArray): Int {
    var ret = 0
    for (ahead in 1 until nums.size) {
        if (nums[ahead] != nums[ret]) {
            ret++
            nums[ret] = nums[ahead]
        }
    }
    return ret + 1
}