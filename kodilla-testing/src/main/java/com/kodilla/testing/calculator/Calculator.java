package com.kodilla.testing.calculator;

public class Calculator {

    int first;
    int second;

    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int add() {
        return first + second;
    }

    public int subtract() {
        return first - second;
    }
}