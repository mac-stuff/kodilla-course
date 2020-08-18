package com.kodilla.rps;

import java.util.*;

public class Game {

    private static String userMove;
    private static String computerMove;
    private static final List<String> winnersList = new ArrayList<>();
    private static String winner;

    public static void setUserMove(String userName) {
        String userChoice = getUserChoice();
        Player user = new Player(userName, userChoice);
        System.out.println(user.printMessage());
        userMove = user.getChoice();
    }

    private static String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        do {
            System.out.println("Please enter your shape:");
            System.out.println("\t if you chose scissors press 1 \n" +
                    "\t if you chose paper press 2 \n" +
                    "\t if you chose rock press 3 \n" +
                    "\t for exit press x ");
            userChoice = scanner.nextLine();
        } while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3") && !userChoice.equals("x"));
        return userChoice;
    }

    public static boolean checkIfWantToPlay() {
        return !userMove.equals("x");
    }

    public static void setComputerMove(String level) {
        int computerChoice;
        if (level.equals("1")) {
            computerChoice = getComputerChoice();
        } else {
            computerChoice = getComputerChoiceLevelSimple();
        }
        Player computer = new Player("computer", String.valueOf(computerChoice));
        System.out.println(computer.printMessage());
        computerMove = computer.getChoice();
    }

    private static int getComputerChoice() {
        Random random = new Random();
        int computerChoice;
        if (userMove.equals("1")) {
            computerChoice = Arrays.asList(2, 3).get(random.nextInt(Arrays.asList(2, 3).size()));
        } else if (userMove.equals("2")) {
            computerChoice = Arrays.asList(1, 3).get(random.nextInt(Arrays.asList(1, 3).size()));
        } else {
            computerChoice = Arrays.asList(1, 2).get(random.nextInt(Arrays.asList(1, 2).size()));
        }
        return computerChoice;
    }

    private static int getComputerChoiceLevelSimple() {
        int computerChoice;
        if (userMove.equals("1")) {
            computerChoice = 2;
        } else if (userMove.equals("2")) {
            computerChoice = 3;
        } else {
            computerChoice = 1;
        }
        return computerChoice;
    }

    public static void addWinner() {
        if (userMove.equals("1") && computerMove.equals("2")) {
            winnersList.add("user");
            System.out.println("★★★ YOU WIN THE ROUND! ★★★");
        } else if (userMove.equals("1") && computerMove.equals("3")) {
            winnersList.add("computer");
            System.out.println("★★★ COMPUTER WIN THE ROUND! ★★★");
        } else if (userMove.equals("2") && computerMove.equals("1")) {
            winnersList.add("computer");
            System.out.println("★★★ COMPUTER WIN THE ROUND! ★★★");
        } else if (userMove.equals("2") && computerMove.equals("3")) {
            winnersList.add("user");
            System.out.println("★★★ YOU WIN THE ROUND! ★★★");
        } else if (userMove.equals("3") && computerMove.equals("1")) {
            winnersList.add("user");
            System.out.println("★★★ YOU WIN THE ROUND! ★★★");
        } else if (userMove.equals("3") && computerMove.equals("2")) {
            winnersList.add("computer");
            System.out.println("★★★ COMPUTER WIN THE ROUND! ★★★");
        }
        getStatistics();
    }

    private static void getStatistics() {
        System.out.println("STATISTICS:");
        int user = 0;
        int computer = 0;
        for(String winner: winnersList) {
            if(winner.equals("user")) {
                user++;
            } else {
                computer++;
            }
        }
        System.out.println("★★★ YOU WON " + user + " TIMES  ★★★ COMPUTER WON " + computer + " TIMES ★★★\n");
    }

    public static void setWinner() {
        int userWonCounter = 0;
        int computerWonCounter = 0;
        for(String winner : winnersList) {
            if(winner.equals("user")) {
                userWonCounter ++;
            } else {
                computerWonCounter ++;
            }
        }
        if (userWonCounter > computerWonCounter) {
            winner = "user";
        } else if (userWonCounter < computerWonCounter) {
            winner = "computer";
        } else {
            winner = "draw";
        }
    }

    public static void printWinner() {
        if (winner.equals("user")) {
            System.out.println("★★★ YOU WIN GAME! ★★★ Congratulations!\n");
        } else if (winner.equals("computer")) {
            System.out.println("★★★ COMPUTER WIN GAME! ★★★ Game over!\n");
        } else {
            System.out.println("★★★ DRAW! ★★★ Game over!\n");
        }
        System.out.println("★★★ GOOD BYE! ★★★");
    }
}
