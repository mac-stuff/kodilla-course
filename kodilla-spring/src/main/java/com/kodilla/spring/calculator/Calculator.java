package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    double add(double a, double b) {
        double value = a + b;
        display.displayValue(value);
        return value;
    }

    double sub(double a, double b) {
        double value = a - b;
        display.displayValue(value);
        return value;
    }

    double mul(double a, double b) {
        double value = a * b;
        display.displayValue(value);
        return value;
    }

    double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0.");
        }
        double value = a / b;
        display.displayValue(value);
        return value;
    }
}
