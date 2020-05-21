# Getters and Settings

In Kotlin, getters and setters are optional and are auto-generated if you do not create them in your program.

For example:
```kotlin
class Person {
    var name: String = "defaultValue"
}

// equivalent to
class Person {
    var name: String = "defaultValue"
    
    // getter
    get() = field
    
    // setter
    set(value) {
        field = value
    }
}
```

### Class
Boy.kt