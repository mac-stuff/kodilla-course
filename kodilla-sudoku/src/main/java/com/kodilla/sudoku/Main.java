package com.kodilla.sudoku;

public class Main {

    private static boolean gameFinished = false;

    public static void main(String[] args) {

        while (!gameFinished) {
            int size = 9;
            SudokuGame sudokuGame = new SudokuGame(size);
            gameFinished = sudokuGame.resolveSudoku();
        }
        System.out.println("Good Bye!");
    }
}
