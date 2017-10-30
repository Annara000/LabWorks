package khai.lab_3

import kotlin.Array

interface ArrayFirstLess {
    /**
     * Вывести значение первого из элементов A, который меньше T.
     * Если таких элементов нет, то вывести 0.
     */
    fun first_less(A: Array<Double>, T: Double)
}

interface ArrayRangeKL {
    /**
     * Найти сумму элементов массива A с номерами от K до L включительно.
     */
    fun range_kl(A: Array<Double>, K: Int, L: Int)
}

interface ArrayExceptKL {
    /**
     * Найти сумму всех элементов массива,
     * кроме элементов с номерами от K до L.
     */
    fun except_kl(A: Array<Double>, K: Int, L: Int)
}

interface ArrayMinAbs {
    /**
     * Найти элемент массива A, модуль разницы которого с D минимален.
     */
    fun min_abs(A: Array<Double>, D: Double)
}

interface ArrayRiseRanges {
    /**
     * Найти количество участков в массиве A, на которых его элементы
     * монотонно возрастают (каждый последующий больше предыдущего).
     */
    fun rise_ranges(A: Array<Double>)
}

interface ArrayFirstMin {
    /**
     * Найти номер первого локального минимума массива A (локальный
     * минимум - это элемент, который меньше своего левого
     * и правого соседей).
     */
    fun first_min(A: Array<Double>)
}

interface ArrayRightMore {
    /**
     * Вывести номера тех элементов массива A,
     * которые больше своего правого соседа.
     * Вывести количество таких элементов.
     */
    fun right_more(A: Array<Double>)
}

interface ArrayMinEven {
    /**
     * Найти минимальный элемент массива A из его элементов
     * с четными индексами.
     */
    fun min_even(A: Array<Double>)
}

interface ArrayPositiveChange {
    /**
     * Проверить, чередуются ли в массиве A положительные
     * и отрицательные числа. Если чередуются, то вывести 0,
     * если нет, то вывести максимальное из чисел массива.
     */
    fun positive_change(A: Array<Double>)
}

interface ArrayOddEven {
    /**
     * Проверить, чередуются ли в массиве A четные и нечетные числа.
     * Если чередуются, то вывести 0, если нет, то вывести 1.
     */
    fun odd_even(A: Array<Double>)
}