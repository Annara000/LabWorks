package khai.lab2

enum class Mark(val min_ects: Int, val max_ects: Int) {
    A(90, 100),
    B(84, 89),
    C(75, 83),
    D(67, 74),
    E(60, 66),
    F(0, 59)
}

enum class Control(val markable: Boolean) {
    EXAM(true),
    CREDIT(false),
    DIFF_CREDIT(true)
}