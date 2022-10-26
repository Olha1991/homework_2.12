package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculationMethodsImpl implements CalculationMethods {
    @Override
    public int plus(int a, int b){
        return a +b;
    }
    @Override
    public int minus(int a, int b){
        return a - b;
    }
    @Override
    public int multiply(int a, int b){
        return a * b;
    }
    @Override
    public double divide(int a, int b){
        if (b == 0) throw new ExceptionByZero("Ошибка!");
        return (double) a / b;
    }
}
