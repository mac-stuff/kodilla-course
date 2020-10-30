package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputHandling {

    private boolean isCorrect = false;
    Scanner scanner = new Scanner(System.in);

    public String getUserChoice() {

        String choice = null;
        while (!isCorrect) {
            System.out.println("Please press '1' to enter coordinates (1-9) and values (1-9) or press '2' to solve SUDOKU: ");
            choice = scanner.nextLine();
            isCorrect = checkIfChoiceIsCorrect(choice);
        }
        isCorrect = false;

        return choice;
    }

    public List<Integer> getCoordinatesAndValues() {

        List<Integer> values = new ArrayList<>();
        String horizontal = null;
        while (!isCorrect) {
            System.out.println("enter horizontal coordinate: ");
            horizontal = scanner.nextLine();
            isCorrect = checkIfValueIsCorrect(horizontal);
        }
        assert horizontal != null;
        values.add(Integer.parseInt(horizontal) - 1);
        isCorrect = false;

        String vertical = null;
        while (!isCorrect) {
            System.out.println("enter vertical coordinate: ");
            vertical = scanner.nextLine();
            isCorrect = checkIfValueIsCorrect(vertical);
        }
        values.add(Integer.parseInt(vertical) - 1);
        isCorrect = false;

        String value = null;
        while (!isCorrect) {
            System.out.println("enter value: ");
            value = scanner.nextLine();
            isCorrect = checkIfValueIsCorrect(value);
        }
        values.add(Integer.parseInt(value));
        isCorrect = false;

        return values;
    }

    private boolean checkIfChoiceIsCorrect(String value) {
        List<String> correctValues = new ArrayList<>(Arrays.asList("1", "2"));
        return correctValues.contains(value);
    }

    private boolean checkIfValueIsCorrect(String value) {
        List<String> correctValues = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        return correctValues.contains(value);
    }

    public String getIsGameFinished() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? (if yes - press y, if no - press other key)");
        return scanner.nextLine().toLowerCase();
    }
}
