package khai.lab2

import com.sun.org.apache.xpath.internal.operations.Bool
import javafx.beans.binding.When

class Student constructor(override var specialization: String,override var mark: Int,var param: Boolean):
        Bachelor(), Exam {
    data class Person(val name: String, val surname: String)
    override fun study() {
        println("Studying $specialization...")
    }

    override fun drink_something(what: String) {
        super.drink_something(what)
        println("Done.")
    }

    override fun pass(mark: Int) {
        if (mark<60) {
            println("Not passed am exam")
            param =false
        }
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

    enum class Control(val markable: Boolean) {//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        EXAM(true),
        CREDIT(false),
        DIFF_CREDIT(true)
    }
}