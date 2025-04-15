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

    public double exponenciar(double a, double b) {
        if (a < 0) {
            throw new ArithmeticException("Error al intentar exponenciar un número negativo");
        } else if (a == 0) {
            if (b < 0) {
                throw new ArithmeticException("Operación Indefinida");
            } else if (b == 0) {
                throw new ArithmeticException("Operación Indeterminada");
            }
        }
        return calculatorRepository.exponenciacion(a, b);
    }

    public long calcularFactorial(int n) {
        if (n < 0) throw new ArithmeticException("El argumento no puede ser negativo");
        if (n > 20) throw new IllegalArgumentException("El resultado es un número muy grande...");
        return calculatorRepository.factorial(n);
    }

}
