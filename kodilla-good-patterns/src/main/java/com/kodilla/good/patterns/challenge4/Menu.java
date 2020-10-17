package com.kodilla.good.patterns.challenge4;

import java.util.Scanner;

public class Menu {

    public static int getUserChoice() {
        String menu = "Please select from the menu:\n" +
                "1 - to find all flights from\n" +
                "2 - to find all flights to\n" +
                "3 - to find all flights via\n";
        System.out.println(menu);
        return checkUserChoice();
    }

    private static int checkUserChoice() {
        int userChoice;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();
            if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
                break;
            } else {
                System.out.println("Please select the correct value:\n");
            }
        }
        return userChoice;
    }

    public static String getFrom() {
        System.out.print("Please enter city name to view flights from:\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getTo() {
        System.out.print("Please enter city name to view flights to:\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getVia() {
        System.out.print("Please enter city name to view flights to-from:\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
