package ru.sibsutis.workwithgitlab

/**
 * Класс, содержащий функции поиска минимального и максимального чисел
 * @author Alexandra Gervas
 *
 */
class Functions {
    /**
     * Функция поиска минимального числа
     *
     * @param a - первое число
     * @param b - второе число
     * @return минимальное число a или b
     */
    public fun myMin(a: Int, b: Int): Int {
        return if (a < b) a
        else b
    }

    /**
     * Функция поиска максимального числа
     *
     * @param a - первое число
     * @param b - второе число
     * @return максимальное число a или b
     */
    public fun myMax(a: Int, b: Int): Int {
        return if (a > b) a
        else b
    }
}