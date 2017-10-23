package khai.lab2

fun main(args: Array<String>) {
    //Bachelor Exam Curiosity Control Person Bad
    println("Lab 2\nVariant№36")
    val Name = Person("Jane","Doe")
    println("${Name.name} ${Name.surname}")

    val example1 = Student("Math",75,false)
    example1.study()
    example1.drink_something("tea")
    println("Expected mark is ${example1.mark}")

    println("${example1.param}")
    example1.Curiosity().assess()

    example1.pass(100)
    println("${example1.param}")
    example1.Curiosity().assess()

    println("Markability: ${example1.specialization} is ${Control.EXAM} -> ${Control.EXAM.markable}")
    println("if ${example1.specialization} is ${Control.DIFF_CREDIT} -> ${Control.DIFF_CREDIT.markable}")
    println("if ${example1.specialization} is ${Control.CREDIT} -> ${Control.CREDIT.markable}")
}