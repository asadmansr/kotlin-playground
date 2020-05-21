# OOP

### Objects

In OOP, you can divide a complex problem into smaller sets by creating objects. An object shares two characteristics:
- state
- behaviour

Let's take an example:
- Lamp is an object
  - it can have `on` and `off` state
  - it can have `turn on` and `turn off` behaviour
- Bicycle is an object
  - it can have `current gear`, `two wheels` and `number of gear` state
  - it can have `braking`, `accelerating` and `changing gear` behaviour
  
### Class

Before we create an object, we need to define a class. A class is a **blueprint** for the object.

We can think of class as a sketch (prototype) of a house. It contains all the details about the floors, doors, windows, etc. Based on these descriptions, we build the house. House is the object. Since, many houses can be made from the same description, we can create many objects from a class.

```kotlin
class ClassName {
    // property
    // member function
}

class Lamp {
    // property (data member)
    private var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }
}
```

Note: In Kotlin, either the property must be initialized or must be declared abstract.

Classes, objects, properties, member functions can have visibility modifiers.
- private: visible from inside the class only
- public: visible everywhere
- protected: visible to the class and its subclass
- internal: any client inside the module can access them

### Objects
When class is defined, only the specification for the the object is defined; no memory or storage is allocated. To access members defined within the class,s you need to create objects. Let's create objects of Lamp class.

```kotlin
class Lamp {
    private var isOn: Boolean = false
    
    fun turnOn() {
        isOn = true
    }
    
    fun turnOff() {
        isOn = false
    }
}

fun main(args: Array<String>) {
    val l1 = Lamp()
    val l2 = Lamp()
}
```

### Class
Lamp.kt
