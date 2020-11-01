package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputHandling {

    Scanner scanner = new Scanner(System.in);

    public List<Integer> getCoordinatesAndValues() {

        List<Integer> coordinatesAndValue = new ArrayList<>();
        boolean isCorrect = false;

        while (!isCorrect) {
            System.out.println("Please enter horizontal coordinate, vertical coordinate and value (from 1 to 9) separating with a comma (e.g: 2,4,7) " +
                    "or type SUDOKU to solve sudoku: ");
            String input = scanner.nextLine().replaceAll("\\s+","").toUpperCase();

            if (input.equals("SUDOKU")) {
                return coordinatesAndValue;
            }

            String[] data = input.split(",");
            if (data.length == 3) {
                if (checkIfIsCorrect(data[0]) && checkIfIsCorrect(data[1]) && checkIfIsCorrect(data[2])) {
                    coordinatesAndValue = Arrays.asList(Integer.parseInt(data[0]) - 1, Integer.parseInt(data[1]) - 1, Integer.parseInt(data[2]));
                    isCorrect = true;
                }
            }
        }
        return coordinatesAndValue;
    }

    private boolean checkIfIsCorrect(String value) {
        List<String> correctValues = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        return correctValues.contains(value);
    }

    public String isGameFinished() {
        System.out.println("Do you want to play again? (if yes - press y, if no - press other key).");
        return scanner.nextLine().toLowerCase();
    }
}
