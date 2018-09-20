package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">121. Best Time to Buy and Sell Stock</a>
 */
fun Solution.maxProfit(prices : IntArray) : Int {
    var min = Int.MAX_VALUE
    var delta = 0
    prices.forEach {
        if (it < min) {
            min = it
        } else {
            val value = it - min
            if (value > delta) {
                delta = value
            }
        }
    }
    return delta
}