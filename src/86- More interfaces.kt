fun main(args: Array<String>) {
    val crawler1 = AparatCrawler()
    val crawler2 = YoutubeCrawler()

    crawler1.getContentBySearch("Kotlin")
    crawler1.getContentByCategory("Sport")
    crawler1.getContentByUsername("kt")
    crawler1.paginate()

    crawler2.getContentByCategory("Sport")
    crawler2.getContentByCountry("Iran")
    crawler2.getContentBySearch("Laravel")
    crawler2.getContentByUsername("Aziz")
    crawler2.setProxy()
    println(crawler2.getProxy())
    crawler2.paginate()
}

interface Crawler {
    val name: String
    fun getContentBySearch(keyword: String)
    fun getContentByCategory(category: String)
    fun getContentByUsername(userName: String)
}

interface Proxy {
    val host: String
    val port: Int
    fun setProxy()
    fun getProxy(): String
}

interface ResponseGenerator {
    fun paginate()
}

class AparatCrawler : Crawler, ResponseGenerator {
    override val name: String = "Aparat"
    override fun getContentBySearch(keyword: String) {
        println("Aparat: search keyword is : $keyword, Contents result : [...]")
    }

    override fun getContentByCategory(category: String) {
        println("Aparat: category is : $category, Contents result : [...]")
    }

    override fun getContentByUsername(userName: String) {
        println("Aparat: Username is : $userName, Contents result : [...]")
    }

    override fun paginate() {
        println("Aparat: Paginated Contents result : [...]")
    }

}

class YoutubeCrawler : Crawler, ResponseGenerator, Proxy {
    override val name: String = "ِYoutube"
    override val host: String = "https://proxy1.com"
    override val port: Int = 9595

    override fun getContentBySearch(keyword: String) {
        println("ِYoutube: search keyword is : $keyword, Contents result : [...]")
    }

    override fun getContentByCategory(category: String) {
        println("ِYoutube: category is : $category, Contents result : [...]")
    }

    override fun getContentByUsername(userName: String) {
        println("ِYoutube: Username is : $userName, Contents result : [...]")
    }


    override fun paginate() {
        println("ِYoutube: Paginated Contents result : [...]")
    }

    override fun setProxy() {
        println("Youtube: set proxy to download video")
    }

    override fun getProxy(): String {
        return this.host + ":" + this.port
    }

    fun getContentByCountry(country: String) {
        println("ِYoutube: country is : $country, Contents result : [...]")
    }
}

