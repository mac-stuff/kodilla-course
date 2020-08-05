package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator(3, 5);

        int addResult = calculator.add();

        if (addResult == 8) {
            System.out.println("Addiction - test OK");
        } else {
            System.out.println("Error!");
        }

        int subtractResult = calculator.subtract();

        if (subtractResult == -2) {
            System.out.println("Subtraction - test OK");
        } else {
            System.out.println("Error!");
        }
    }
}