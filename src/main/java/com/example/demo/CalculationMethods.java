package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculationMethods {
    public int plus(Integer a, Integer b){
        return a +b;
    }
    public int minus(Integer a, Integer b){
        return a - b;
    }
    public int multiply(Integer a, Integer b){
        return a * b;
    }
    public double divide(Integer a, Integer b){
        if (b == 0) throw new IllegalArgumentException("Ошибка!");
        return (double) a / b;
    }
}
