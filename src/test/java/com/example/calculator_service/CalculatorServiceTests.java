package com.example.calculator_service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorServiceTests {

    private final CalculatorService calculatorService = new CalculatorService();


    @Test
    void testSum(){
        assertEquals(5, calculatorService.sum(2, 3));
    }

    @Test
    void testSub(){
        assertEquals(4, calculatorService.sub(10, 6));
    }

    @Test
    void testMultiply(){
        assertEquals(20, calculatorService.multiply(5, 4));
    }

    @Test
    void testDivision(){
        assertEquals(2.5, calculatorService.divide(5, 2));
    }

    @Test
    void testDivisionByZero(){
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(10, 0));
    }
}
