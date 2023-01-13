package ru.hse.mavendemo88888;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @Test
    void onePlusOneIsTwo() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 1);

        assertEquals(2, result);
    }

    @Test
    void twoPlusOneIsThree() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);

        assertEquals(3, result);
    }

    @Test
    void overflowTest() {
        Calculator calculator = new Calculator();

        Assertions.assertThrows(ArithmeticException.class,
                () -> calculator.add(Integer.MAX_VALUE, 1));

    }

    @ParameterizedTest
    @MethodSource("additionTestData")
    void additionWorks(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(a, b));
    }

    public static Stream<Arguments> additionTestData() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(3, 4, 7)
        );
    }
}