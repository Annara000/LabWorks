package khai.lab2

import com.sun.org.apache.xpath.internal.operations.Bool
import javafx.beans.binding.When

class Student : Bachelor(), Exam {
    override var specialization ="Math"
    override fun study() {
        println("Studying $specialization...")
    }

    override fun drink_something(what: String) {
        super.drink_something(what)
        println("Drunk.")
    }

    override var mark=59
    var param: Boolean = false
    override fun pass(mark: Int) {
        if (mark<60)
            println("Not passed am exam")
        else {
            println("Passed am exam")
            param = true
        }
    }

    inner class Curiosity {
        fun assess() {
            when(param) {
                true -> println("Student is interested.")
                false -> println("Student is not interested.")
            }
        }
    }
}