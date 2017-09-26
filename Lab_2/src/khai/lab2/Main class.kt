package khai.lab2

class Student : Bachelor() {
    override fun study() {
        println("Studying $specialization...")
    }

    override fun drink_something(what: String) {
        super.drink_something(what)
        println("Drunk.")
    }

}
