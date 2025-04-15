package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final CalculatorRepository calculatorRepository;

    public CalculatorService(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    public double sumar(double a, double b) {
        return calculatorRepository.suma(a, b);
    }

    public double restar(double a, double b) {
        return calculatorRepository.resta(a, b);
    }

    public double multiplicar(double a, double b) {
        return calculatorRepository.multiplicacion(a, b);
    }

    public double dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return calculatorRepository.division(a, b);
    }

    public double potenciar(double a, double b) {
        if (a == 0 & b == 0) throw new ArithmeticException("Indefinido");
        return calculatorRepository.potenciacion(a, b);
    }

}
