package khai.lab_3

interface LogicBigDiff {
    /**
     * Даны три числа. Найти разность между наибольшим
     * и наименьшим из них.
     */
    fun big_diff(a: Double, b: Double, c: Double): Double
}

interface LogicFindMedian {
    /**
     * Даны три числа. Найти среднее из них (то есть число,
     * расположенное между наименьшим и наибольшим).
     */
    fun find_median(a: Double, b: Double, c: Double): Double
}

interface LogicBigSum {
    /**
     * Даны три числа. Найти сумму двух наибольших из них.
     */
    fun big_sum(a: Double, b: Double, c: Double): Double
}

interface LogicCountPositive {
    /**
     * Даны три числа. Найти количество положительных чисел
     * в исходном наборе.
     */
    fun count_positive(a: Double, b: Double, c: Double): Int
}

interface LogicMinNegative {
    /**
     * Даны три числа. Метод возвращает ноль, если наименьшее из них
     * - отрицательное число, и один - в остальных случаях.
     */
    fun min_negative(a: Double, b: Double, c: Double): Int
}

interface LogicMinIndex {
    /**
     * Даны три числа. Выдать порядковый номер меньшего из них.
     */
    fun min_index(a: Double, b: Double, c: Double): Int
}

interface LogicCheckEqual {
    /**
     * Даны три числа. Выдать один, если хотя бы два из них равны,
     * и ноль в остальных случаях.
     */
    fun check_equal(a: Double, b: Double, c: Double): Int
}

interface LogicFindDifferent {
    /**
     * Даны три числа, одно из которых отлично от двух других,
     * равных между собой. Определить порядковый номер числа,
     * отличного от остальных.
     */
    fun find_different(a: Double, b: Double, c: Double): Int
}

interface LogicMaxDiff {
    /**
     * Даны три числа. Вычесть самое большое число
     * из произведения двух остальных чисел
     */
    fun max_diff(a: Double, b: Double, c: Double): Double
}

interface LogicCalcResidual {
    /**
     * Даны три числа. Найти остаток от деления самого большого на
     * самое маленькое число.
     */
    fun calc_residual(a: Double, b: Double, c: Double): Double
}