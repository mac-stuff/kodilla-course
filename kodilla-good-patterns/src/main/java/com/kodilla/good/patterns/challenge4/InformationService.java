package com.kodilla.good.patterns.challenge4;

import java.util.List;

public class InformationService {

    public static void printMessage(List<Flight> flights) {
        if (flights.size() >= 1) {
            for (Flight flight : flights) {
                System.out.println(flight.toString());
            }
        } else {
            System.out.println("Sorry, there is no such flight.");
        }
    }
}
