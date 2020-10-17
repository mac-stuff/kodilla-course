package com.kodilla.good.patterns.challenge4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightScanner {

    private static Flights flights = new Flights();

    public static List<Flight> searchFlightFrom(String city) {
        return flights.getFlights().stream()
                .filter(n -> n.getFrom().toUpperCase().equals(city.toUpperCase()))
                .collect(Collectors.toList());
    }

    public static List<Flight> searchFlightTo(String city) {
        return flights.getFlights().stream()
                .filter(n -> n.getTo().toUpperCase().equals(city.toUpperCase()))
                .collect(Collectors.toList());
    }

    public static List<Flight> searchFlightVia(String city) {
        return new ArrayList<>() {{
            addAll(searchFlightTo(city));
            addAll(searchFlightFrom(city));
        }};
    }

    public static void fillFlightDatabase() {

        Flight fly1 = new Flight("Rome", "Paris", "17:20");
        Flight fly2 = new Flight("Berlin", "London", "12:00");
        Flight fly3 = new Flight("Vienna", "Minsk", "15:20");
        Flight fly4 = new Flight("Sofia", "Zagreb", "12:30");
        Flight fly5 = new Flight("Riga", "Paris", "17:50");
        Flight fly6 = new Flight("Amsterdam", "Oslo", "11:00");
        Flight fly7 = new Flight("Minsk", "Berlin", "13:45");
        Flight fly8 = new Flight("London", "Paris", "17:10");
        Flight fly9 = new Flight("Berlin", "Minsk", "18:12");
        Flight fly10 = new Flight("Paris", "Zagreb", "13:12");
        Flight fly11 = new Flight("London", "Vienna", "12:10");
        Flight fly12 = new Flight("Berlin", "Sofia", "12:12");
        Flight fly13 = new Flight("Paris", "Minsk", "18:12");

        flights.addFlight(fly1);
        flights.addFlight(fly2);
        flights.addFlight(fly3);
        flights.addFlight(fly4);
        flights.addFlight(fly5);
        flights.addFlight(fly6);
        flights.addFlight(fly7);
        flights.addFlight(fly8);
        flights.addFlight(fly9);
        flights.addFlight(fly10);
        flights.addFlight(fly11);
        flights.addFlight(fly12);
        flights.removeFlight(fly13);
    }
}
