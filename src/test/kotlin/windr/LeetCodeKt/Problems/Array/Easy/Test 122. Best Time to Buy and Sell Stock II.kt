package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.SolutionTest

fun SolutionTest.testBestTimeToBuyAndSellStockII() {
    var output = Solution.maxProfit2(intArrayOf(7, 1, 5, 3, 6, 4))
    assert(output == 7)
    output = Solution.maxProfit2(intArrayOf(1, 2, 3, 4, 5))
    assert(output == 4)
    output = Solution.maxProfit2(intArrayOf(7, 6, 4, 3, 1))
    assert(output == 0)
}