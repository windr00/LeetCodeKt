package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.SolutionTest

fun SolutionTest.testBestTimeToBuyAndSellStock() {
    var output = Solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
    assert(output == 5)
    output = Solution.maxProfit(intArrayOf(7, 6, 4, 3, 1))
    assert(output == 0)
}