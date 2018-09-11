package windr.LeetCodeKt

import org.apache.commons.io.FileUtils
import org.junit.BeforeClass
import org.junit.Test
import windr.LeetCodeKt.Problems.Array.Easy.*
import java.io.File
import java.io.InputStreamReader
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

class SolutionTest {


    companion object {

        val osBit = System.getProperty("sun.arch.data.model").toInt()

        val osType = System.getProperty("os.name")

        val fileSeparator = System.getProperty("file.separator")

        val workingDirectory = System.getProperty("user.dir")

        val leetCodeResidentPath = "leetcode_cli"

        const val nodeJSPackageStorageName = "nodejs.zip"

        const val nodeJSPackageHTTPPrefix = "https://nodejs.org/dist/v8.11.4/node-v8.11.4"

        const val nodeJSPackageHTTPSuffix = ".zip"

        val shell = Runtime.getRuntime()

        private fun Process.then(after: (exitValue: Int, output: List<String>) -> Unit): Runtime {
            this.waitFor()
            after(this.exitValue(), InputStreamReader(this.inputStream).readLines())
            return Runtime.getRuntime()
        }

        private fun downloadNodeJS() {
            var nodeJSPackagePath = "$nodeJSPackageHTTPPrefix-"
            if (osType.toLowerCase().contains("win")) {
                nodeJSPackagePath += "win-"
            } else {
                throw RuntimeException("$osType currently not supported")
            }
            nodeJSPackagePath += if (osBit == 32) {
                "x86"
            } else {
                "x64"
            }
            nodeJSPackagePath += nodeJSPackageHTTPSuffix
            val httpLocation = URL(nodeJSPackagePath)
            FileUtils.copyURLToFile(httpLocation, File(workingDirectory cat leetCodeResidentPath cat nodeJSPackageStorageName))
        }

        private infix fun String.cat(o: String): String {
            if (!this.endsWith(fileSeparator)) {
                return this + fileSeparator + o
            }
            return this + o
        }

        @BeforeClass
        @JvmStatic
        fun prepareLeetCodeCLI() {
            val shell = Runtime.getRuntime()
            val classPath = javaClass.classLoader.getResource("").toURI().rawPath.substring(1)
            try {
                shell.exec("cmd.exe /c cd C:\\Users\n dir").then { exitValue, output ->
                    println(exitValue)
                    output.forEach { println(it) }
                }
            } catch (exp: Exception) {
                val leetCodeResident = File(workingDirectory cat leetCodeResidentPath)
                if (leetCodeResident.exists() && leetCodeResident.isDirectory) {
                    leetCodeResident.delete()
                }
                leetCodeResident.mkdir()
                downloadNodeJS()
            }
        }
    }


    @Test
    fun testAll() {
        testTwoSum()
        testRemoveDuplicatesFromSotedArray()
        testRemoveElement()
        testSearchInsertPosition()
        testMaxSubArray()
        testPlusOne()
        testMergeSortedArray()
        testPascalsTriangle()
    }

}
