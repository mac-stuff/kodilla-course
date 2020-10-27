package com.kodilla.sudoku;

public class Main {

    private static boolean gameFinished = false;

    public static void main(String[] args) {

        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
