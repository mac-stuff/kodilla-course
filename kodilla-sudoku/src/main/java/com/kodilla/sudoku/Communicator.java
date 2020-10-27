package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Communicator {

    Scanner scanner = new Scanner(System.in);

    List<Integer> inputSudokuValues() {
        List<Integer> sudokuValues = new ArrayList<>();
        System.out.println("Please enter coordinates and values (for example 1, 1, 3)");
        System.out.println("horizontal coordinate: ");
        int horizontal = scanner.nextInt();
        sudokuValues.add(horizontal);
        System.out.println("vertical coordinate: ");
        int vertical = scanner.nextInt();
        sudokuValues.add(vertical);
        System.out.println("value (1-9): ");
        int value = scanner.nextInt();
        sudokuValues.add(value);
        System.out.println("You have added the following values: " + sudokuValues.toString() + ".");
        return sudokuValues;
    }

    String inputIsGameFinished() {
        System.out.println("Do you want to play again? (if yes - press y, if no - press other key)");
        return scanner.nextLine().toLowerCase();
    }
}
