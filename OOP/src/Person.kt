class Person(val firstName: String, var age: Int) {

}

class Person2(_firstName: String = "UNKNOWN", _age: Int = 0) {
    val firstName: String
    var age: Int

    init {
        firstName = _firstName.capitalize()
        age = _age

        println("First Name = $firstName")
        println("Age = $age")
    }
}

fun main() {
    val person1 = Person("Joe", 25)
    // person1.firstName = "temp" // not allowed
    person1.age = 30
    println("${person1.firstName}")
    println("${person1.age}")

    val person2 = Person2("Joe", 25)
    val person3 = Person2()
}