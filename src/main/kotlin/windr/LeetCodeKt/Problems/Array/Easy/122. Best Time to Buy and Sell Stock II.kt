package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/">122. Best Time to Buy and Sell Stock II</a>
 */
fun Solution.maxProfit2(prices : IntArray) : Int {
    var ret = 0
    for (idx in 1 until prices.size) {
        if (prices[idx - 1] < prices[idx]) {
            ret += prices[idx] - prices[idx - 1]
        }
    }
    return ret
}