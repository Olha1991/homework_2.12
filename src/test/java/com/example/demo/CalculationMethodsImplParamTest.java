package com.example.demo;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.demo.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationMethodsImplParamTest {

    private final CalculationMethods calculationMethods = new CalculationMethodsImpl();

    @ParameterizedTest
    @MethodSource("provideCalculationMethodsParams")
    public void plusCorrectly(int a, int b){
        int result = calculationMethods.plus(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculationMethodsParams")
    public void minusCorrectly(int a, int b){
        int result = calculationMethods.minus(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculationMethodsParams")
    public void multiplyCorrectly(int a, int b){
        int result = calculationMethods.multiply(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculationMethodsParams")
    public void divideCorrectly(int a, int b){
        int result = (int) calculationMethods.divide(a, b);
        assertEquals(a / b, result);
    }
    private static Stream<Arguments> provideCalculationMethodsParams(){
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO),
                Arguments.of(TWO,THREE),
                Arguments.of(ZERO, THREE)
        );

    }

}
