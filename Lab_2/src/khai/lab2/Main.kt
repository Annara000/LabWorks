package khai.lab2

fun main(args: Array<String>) {
    // Bachelor Exam Curiosity Control Person Bad
    println("Lab 2\nVariant№36")
    val example1 = Student(Student.Person("Jane","Doe"),"Math",60,false)
    println("${example1.Name.name} ${example1.Name.surname}")
    example1.study()
    example1.drink_something("tea")
    println("Expected mark is ${example1.mark}")

    println("${example1.interest}")
    example1.Curiosity().assess()

    example1.pass(100)
    println("${example1.interest}")
    example1.Curiosity().assess()

    println("Markability: ${example1.specialization} is ${Control.EXAM} -> ${Control.EXAM.markable}")
    println("if ${example1.specialization} is ${Control.DIFF_CREDIT} -> ${Control.DIFF_CREDIT.markable}")
    println("if ${example1.specialization} is ${Control.CREDIT} -> ${Control.CREDIT.markable}")

// 7. Object; Interface2
    val badStudent = object : Student(Student.Person("Joe","Black"),"Economic",35,false), Bad {
        var place: Int = 254
        fun show_place_number() {
            println("Current place is ${this.place}")
            println("-----------------------------------")
        }
        override fun send_down() {
            place-=1
            println("${this.Name.name} ${this.Name.surname} failed a test of ${this.specialization}")
            println("sent down in rating")
            this.show_place_number()
        }
    }
    println("${badStudent.Name.name} ${badStudent.Name.surname}")
    badStudent.show_place_number()
    badStudent.send_down()
}