package com.kodilla.good.patterns.challenge4;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FlightScanner.fillFlightDatabase();
        int search = 0;

        while (search < 5) {
            int userChoice = Menu.getUserChoice();
            switch (userChoice) {
                case 1 -> {
                    List<Flight> flights = FlightScanner.searchFlightFrom(Menu.getFrom());
                    InformationService.printMessage(flights);
                }
                case 2 -> {
                    List<Flight> flights = FlightScanner.searchFlightTo(Menu.getTo());
                    InformationService.printMessage(flights);
                }
                case 3 -> {
                    List<Flight> flights = FlightScanner.searchFlightVia(Menu.getVia());
                    InformationService.printMessage(flights);
                }
            }
            search++;
        }
    }
}
