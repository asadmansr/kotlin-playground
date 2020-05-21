class Boy {
    var age: Int = 0
    get() = field
    set(value) {
        field = if (value < 18)
            18
        else if (value >= 18 && value <= 30)
            value
        else
            value-3
    }

    var actualAge: Int = 0
}

fun main() {
    val bob = Boy()
    bob.actualAge = 15
    bob.age = 15
    println("Bob: actual age = ${bob.actualAge}")
    println("Bob: pretended age = ${bob.age}")
}