package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner = new Scanner(System.in);
    private final List<Integer> correctValues = new ArrayList<>();

    public InputHandler(int size) {
        for (int i = 0; i < size; i++) {
            correctValues.add(i + 1);
        }
    }

    public ElementParameterDTO getCoordinatesAndValues() {

        while (true) {
            System.out.println("Please enter horizontal coordinate, vertical coordinate and value separating with a comma (e.g: 2,4,7) " +
                    "or type SUDOKU to solve sudoku: ");
            String input = scanner.nextLine().replaceAll("\\s+","").toUpperCase();

            if (input.equals("SUDOKU")) {
                return null;
            }

            String[] data = input.split(",");
            if (data.length == 3) {
                if (checkIfIsCorrect(data[0]) && checkIfIsCorrect(data[1]) && checkIfIsCorrect(data[2])) {
                    return new ElementParameterDTO(data[0], data[1], data[2]);
                }
            }
        }
    }

    private boolean checkIfIsCorrect(String value) {
        return correctValues.contains(Integer.parseInt(value));
    }

    public String isGameFinished() {
        System.out.println("Do you want to play again? (if yes - press y, if no - press other key).");
        return scanner.nextLine().toLowerCase();
    }
}
