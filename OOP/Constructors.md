# Constructors

A constructor is a concise way to initialize class properties.

In Kotlin, there are two constructors:
- Primary constructor: concise way to initialize a class
- Secondary constructor: allows you to put additional initialization logic

A primary constructor is part of the class header. Example:
```kotlin
class Person(val fistName: String, var age: Int) {
    // class body
}

// constructor declared two properties
// firstName is read-only as its val
// age is read-write as its var
```

The primary constructor has a constrained syntax and it cannot contain any code.

To put the initialization code, initializer block is used. It is prefixed with init keyword.

```kotlin
    init {
        // code
    }
```
It is common to use _Name for constructor parameters. Also you can have pre-defined values for the parameters if they are assigned.

### Secondary Constructor
A class can also contain one more secondary constructors. They are not as common but they come up when you need to extend a class that provides multiple constructors that initialize a class in different ways.

Example:
```kotlin
class Log {
    constructor(data: String){
        // code
    }
    constructor(data:String, numberOfData: Int){
        // code
    }
}

class AuthLog: Log {
    constructor(data: String): super(data){
    }
    constructor(data: String, numberOfData: Int): super(data, numberOfData) {
    }
}
```
Then you can extend the Log class. Extending a class will prompt the following error: "This type has a constructor, and thus must be initialized here"

###
Person.kt
AuthLog.kt