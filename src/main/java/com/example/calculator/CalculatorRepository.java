package com.example.calculator;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorRepository {

    double suma(double a, double b) {
        return a + b;
    }

    double resta(double a, double b) {
        return a - b;
    }

    double multiplicacion(double a, double b) {
        return a * b;
    }

    double division(double a, double b) {
        return a / b;
    }

    double exponenciacion(double a, double b) { return Math.pow(a, b); }

    long factorial(int n) {
        if (n < 2) return 1;
        return n * factorial(n - 1);
    }

}
