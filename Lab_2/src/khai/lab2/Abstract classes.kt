package khai.lab2

abstract class Bachelor {

    abstract var specialization: String

    abstract fun study()

    open fun drink_something(what: String) {
        println("Drinking $what...")
    }

}