fun main() {
    greetUser("Motlaq")
    greetUser(null)

    var address: String? = null

    println(address?: "Kuwait")
    println(calculateArea(5, null))

}

fun greetUser(name: String?) {
    println(name?.length?: 0)
}

fun calculateArea(width: Int?, height: Int?): Int {
    require(width != null && height != null) { return 0 }
    return width * height
}

/**
 * the main difference between an optional value type also called a nullable value containing a '?'
 * and a normal type is that the optional value can contain a null value and the normal type can not contain a null value
 */