package com.example.demo;

import org.junit.jupiter.api.Test;

import static com.example.demo.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculationMethodsImplTest {
    private final CalculationMethods calculationMethods = new CalculationMethodsImpl();

    @Test
    public void plusTest1(){
        int result = calculationMethods.plus(ZERO, TWO);
        assertEquals(ZERO + TWO, result);
    }
    @Test
    public void plusTest2(){
        int result = calculationMethods.plus(ONE, FOUR);
        assertEquals(ONE + FOUR, result);
    }
    @Test
    public void minusTest1(){
        int result = calculationMethods.minus(THREE, TWO);
        assertEquals(THREE - TWO, result);
    }
    @Test
    public void minusTest2(){
        int result = calculationMethods.minus(SIX, FOUR);
        assertEquals(SIX - FOUR, result);
    }
    @Test
    public void multiplyTest1(){
        int result = calculationMethods.multiply(TWO, TWO);
        assertEquals(TWO * TWO, result);
    }
    @Test
    public void multiplyTest2(){
        int result = calculationMethods.multiply(FIVE, ONE);
        assertEquals(FIVE * ONE, result);
    }
    @Test
    public void divideTest1(){
        int result = (int) calculationMethods.divide(SIX, TWO);
        assertEquals(SIX / TWO, result);
    }
    @Test
    public void divideTest2(){
        int result = (int) calculationMethods.divide(SIX, THREE);
        assertEquals(SIX / THREE, result);
    }

    @Test
    public void exceptionByZeroTest(){
        assertThrows(ExceptionByZero.class, ()-> calculationMethods.divide(ONE, ZERO));
    }
}