package ru.fintech.ci.homework;

import java.util.*;

public class MathUtils {

    /**
     * Посчитать факториал числа
     */
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Not applicable for negatives");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    /**
     * Определить, является ли число простым
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Разделить число на простые множители
     */
    public static List<Integer> primeFactorization(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        if (number == 1) {
            throw new IllegalArgumentException("Number 1 cannot be factorized into prime factors");
        }

        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers cannot be factorized into prime factors");
        }

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number = number / i;
            }
        }

        return primeFactors;
    }

//    /**
//     * Посчитать наименьшее общее кратное двух чисел
//     */
//    public static int Calculate_LCM(int a, int b) throws IllegalArgumentException {
//        if (a <= 0 || b <= 0) {
//            throw new IllegalArgumentException("Both numbers must be positive integers");
//        }
//        int gcd = Calculate_GCD(a, b);
//        return (a * b) / gcd;
//    }
//
//    private static int Calculate_GCD(int a, int b) {
//        if (b == 0) {
//            return a;
//        } else {
//            return Calculate_GCD(b, a % b);
//        }
//    }

}