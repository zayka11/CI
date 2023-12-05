package ru.fintech.ci.homework;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {

    @Test
    public void testCalculateFactorialWithPositiveNumber() {
        int number = 5;
        int expectedFactorial = 120;
        int calculatedFactorial = MathUtils.calculateFactorial(number);
        assertEquals(expectedFactorial, calculatedFactorial);
    }

    @Test
    public void testCalculateFactorialWithZero() {
        int number = 0;
        int expectedFactorial = 1;
        int calculatedFactorial = MathUtils.calculateFactorial(number);
        assertEquals(expectedFactorial, calculatedFactorial);
    }

    @Test
    public void testCalculateFactorialWithNegativeNumber() {
        int number = -5;
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.calculateFactorial(number));
    }

    @ParameterizedTest
    @CsvSource({
            "13, true",
            "20, false",
            "-7, false",
            "0, false",
            "1, false"
    })
    public void testIsPrime(int number, boolean expected) {
        boolean isPrime = MathUtils.isPrime(number);
        assertEquals(expected, isPrime);
    }

    @Test
    public void testPrimeFactorizationPositiveNumber() {
        int number = 84;
        List<Integer> expectedPrimeFactors = List.of(2, 2, 3, 7);
        List<Integer> primeFactors = MathUtils.primeFactorization(number);
        Assertions.assertEquals(expectedPrimeFactors, primeFactors);
    }

    @Test
    @Disabled
    public void testPrimeFactorizationNegativeNumber() {
        int number = -84;
        List<Integer> expectedPrimeFactors = List.of(-1, 2, 2, 3, 7);
        List<Integer> primeFactors = MathUtils.primeFactorization(number);
        Assertions.assertEquals(expectedPrimeFactors, primeFactors);
    }

    @Test
    public void testPrimeFactorizationNumberOne() {
        int number = 1;
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.primeFactorization(number));
    }

    @Test
    public void testPrimeFactorizationAnotherPositiveNumber() {
        int number = 120;
        List<Integer> expectedPrimeFactors = List.of(2, 2, 2, 3, 5);
        List<Integer> primeFactors = MathUtils.primeFactorization(number);
        Assertions.assertEquals(expectedPrimeFactors, primeFactors);
    }

}