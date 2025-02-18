fun main() {
    var age: Int? = null
    var cityName: String? = "Kuwait City"
    cityName = null
    println(cityName?.length?: 5)
    score(50.2)
    score(null)
}

fun score(score: Double?) {
    score?.let { nullSafe ->
        println(nullSafe)
    }?: println(0.0)
}