package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public interface CalculationMethods {
    int plus(int a, int b);

    int minus(int a, int b);

    int multiply(int a, int b);

    double divide(int a, int b);
}
