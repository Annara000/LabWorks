package khai.lab2

abstract class Bachelor {

    abstract var specialization: String

    abstract fun study()

    fun drink_something(what: String) {
        println("Drinking $what...")
    }

}

abstract class Master(val speciality: String) {

    abstract fun learn()

    fun learn_now(discipline: String) {
        println("Learning new discipline: $discipline...")
    }

}