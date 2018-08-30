package windr.LeetCodeKt.Problems.Array.Easy

/**
 * @see <a href="https://leetcode.com/problems/two-sum/description/">1. Two Sum</a>
 */
object Solution {
    fun twoSum(nums : IntArray, target : Int) : IntArray {
        val ret = intArrayOf(0, 0)
        run {
            (0 until nums.size).forEach { outter ->
                (outter + 1 until nums.size).forEach { inner ->
                    if (nums[outter] + nums[inner] == target) {
                        ret[0] = outter
                        ret[1] = inner
                        return@run
                    }
                }
            }
        }
        return ret
    }
}