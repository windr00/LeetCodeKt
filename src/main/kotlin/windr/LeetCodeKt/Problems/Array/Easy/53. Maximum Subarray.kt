package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see @see <a href="https://leetcode.com/problems/maximum-subarray/description/">53. Maximum Subarray</a>
 */
fun Solution.maxSubArray(nums : IntArray) : Int {
    var sum = 0
    var maxSum = Int.MIN_VALUE
    nums.forEach {
        sum = Math.max(it, sum + it)
        maxSum = Math.max(sum, maxSum)
    }
    return maxSum
}