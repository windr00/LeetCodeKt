package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see <a href="https://leetcode.com/problems/remove-element/description/">27. Remove Element</a>
 */
fun Solution.removeElement(nums : IntArray, `val` : Int) : Int {
    var ret = 0
    for (ahead in 0 until nums.size) {
        if (nums[ahead] != `val`) {
            nums[ret] = nums[ahead]
            ret++
        }
    }
    return ret
}