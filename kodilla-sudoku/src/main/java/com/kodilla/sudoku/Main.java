package com.kodilla.sudoku;

public class Main {

    private static boolean gameFinished = false;

    public static void main(String[] args) {

        while (!gameFinished) {
            SudokuGame sudokuGame = new SudokuGame();
            gameFinished = sudokuGame.resolveSudoku();
        }
        System.out.println("Good Bye!");
    }
}
