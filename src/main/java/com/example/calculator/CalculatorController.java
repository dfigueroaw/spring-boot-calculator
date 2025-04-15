package com.example.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/suma/{a}/{b}")
    public ResponseEntity<Double> suma(@PathVariable double a, @PathVariable double b) {
        double result = calculatorService.sumar(a, b);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/resta/{a}/{b}")
    public ResponseEntity<Double> resta(@PathVariable double a, @PathVariable double b) {
        double result = calculatorService.restar(a, b);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/multiplicacion/{a}/{b}")
    public ResponseEntity<Double> multiplicacion(@PathVariable double a, @PathVariable double b) {
        double result = calculatorService.multiplicar(a, b);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/division/{a}/{b}")
    public ResponseEntity<?> division(@PathVariable double a, @PathVariable double b) {
        try {
            Double result = calculatorService.dividir(a, b);
            return ResponseEntity.ok(result);
        } catch (ArithmeticException divisionException) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("Error aritmético: " + divisionException.getMessage());
        }
    }

    @GetMapping("/exponenciacion/{a}/{b}")
    public ResponseEntity<?> exponenciacion(@PathVariable double a, @PathVariable double b){
        try {
            double result = calculatorService.exponenciar(a, b);
            return ResponseEntity.ok(result);
        } catch (ArithmeticException potenciacionException) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("Error aritmético: " + potenciacionException.getMessage());
        }
    }
    
}
