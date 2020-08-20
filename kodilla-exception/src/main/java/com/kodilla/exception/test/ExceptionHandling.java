package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            SecondChallenge secondChallenge = new SecondChallenge();
            String result = secondChallenge.probablyIWillThrowException(1.0, 1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Oh no! Something went wrong! Error: " + e);
        } finally {
            System.out.println("End!");
        }
    }
}
