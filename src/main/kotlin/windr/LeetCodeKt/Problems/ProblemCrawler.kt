package windr.LeetCodeKt.Problems

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.apache.http.*
import org.apache.http.client.config.RequestConfig
import org.apache.http.client.entity.UrlEncodedFormEntity
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.HttpClients
import org.apache.http.message.BasicHeader
import org.apache.http.message.BasicHttpRequest
import org.apache.http.message.BasicNameValuePair

class ProblemDifficulty(val level : Int = 0)

class ProblemStat(val question_id : Int = 0, val frontend_question_id : Int = 0, val question__title : String = "", val question__title_slug : String = "")

class Problem(val stat : ProblemStat = ProblemStat(),
              val status : String = "",
              val difficulty : ProblemDifficulty = ProblemDifficulty(),
              val paid_only : Boolean = false)

class ProblemList(val stat_status_pairs : List<Problem> = arrayListOf())

class Crawler(private val username: String, private val password: String) {

    private fun HttpResponse.getCookies(): Array<out Header> {
        return this.getHeaders("Set-Cookie")
    }

    private operator fun Array<out Header>.get(key: String): String? {
        this.forEach {
            if (it.name == key) {
                return it.value
            }
        }
        return null
    }

    private companion object {
        const val leetCodeUrl = "https://leetcode.com"
        const val leetCodeLoginUrl = "https://leetcode.com/accounts/login"
        const val leetCodeAPIUrl = "https://leetcode.com/api/problems/algorithms/"
        const val userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36"
        val json = Gson()
    }

    private lateinit var cookie: String
    private val session = HttpClients.custom().setProxy(HttpHost("127.0.0.1", 8001)).build()

    fun getCSRToken() {
        val request = HttpGet(leetCodeUrl)
        val response = session.execute(request)
        val cookies = response.getCookies()
        cookies.forEach {
            val list = it.value.split("=")
            if (list[0] == "csrftoken") {
                cookie = list[1].split(";")[0]
                return
            }
        }
    }

    fun login(): Boolean {
        val request = HttpPost(leetCodeLoginUrl)
        request.config = RequestConfig.custom().setConnectTimeout(10).build()
        val params = arrayListOf<NameValuePair>(
                BasicNameValuePair("csrfmiddlewaretoken", cookie),
                BasicNameValuePair("login", username),
                BasicNameValuePair("password", password),
                BasicNameValuePair("next", "problems")
        )
        request.entity = UrlEncodedFormEntity(params, Charsets.UTF_8)
        val headers = arrayOf(
                BasicHeader("User-Agent", userAgent),
                BasicHeader("Connection", "keep-alive"),
                BasicHeader("Referer", leetCodeLoginUrl),
                BasicHeader("origin", leetCodeUrl),
                request.entity.contentType
        )
        request.setHeaders(headers)
        val response = session.execute(request)
        val cookies = response.getCookies()
        if (cookies["LEETCODE_SESSION"] != null) {
            return true
        }
        return false
    }

    fun getProblems() {
        val headers = arrayOf(
                BasicHeader("User-Agent", userAgent),
                BasicHeader("Connection", "keep-alive")
        )
        val request = HttpGet(leetCodeAPIUrl)
        request.setHeaders(headers)
        request.config = RequestConfig.custom().setConnectTimeout(10).build()
        val response = session.execute(request)
        val problems = json.fromJson(response.entity.content.reader(Charsets.UTF_8), ProblemList::class.java).stat_status_pairs
        problems.forEach {  }
    }

    fun connect() {
        getProblems()
    }



}

fun main(args: Array<String>) {
    val obj = Crawler("imrwz@icloud.com", "???|||")
    obj.connect()
}
