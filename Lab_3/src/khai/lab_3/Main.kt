package khai.lab_3
//,IterationOddDigits
class Implementor :LogicMinIndex ,ArrayExceptKL {

    override fun min_index(a: Double, b: Double, c: Double): Int {
        val A1 = arrayOf(a,b,c)
        println("Порядковый номер меньшего числа")
        return A1.indexOf(A1.min())
    }

//    override fun odd_digits(N: Int) {}

    override fun except_kl(A: Array<Double>, K: Int, L: Int) {
        var AKL=0.0
        var i=0
        while (i < A.size) {
            if (i in K..L) {
                AKL+=A[i]
            }
            i++
        }
        val result=A.sum()-AKL
        println(result)
    }
}

fun main(args: Array<String>) {
    println("Lab 3.")

    val C = Implementor()
    val A = arrayOf(21.0, 6.0, -7.0, 8.0, 23.0, 7.0, 12.0, 0.0, -5.0, 17.0)
    println("Testing Logic")
    println(C.min_index(0.0,0.0, 0.0))
    println(C.min_index(1.0,-6.0, 5.0))
    println(C.min_index(-10.47655,0.0009, -20.067))
//  Testing Iteration
    println("Testing Array")
    C.except_kl(A,1,3)
    C.except_kl(A,0,8)
    C.except_kl(A,0,9)
}