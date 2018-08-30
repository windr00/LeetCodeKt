package windr.LeetCodeKt

import io.kotlintest.specs.StringSpec
import windr.LeetCodeKt.Problems.Array.Easy.testTwoSum

class TestBase : StringSpec() {
    init {
        "TestAll"{
            this@TestBase.apply {
                testTwoSum()
            }
        }
    }
}
