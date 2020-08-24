package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    private static final Map<String, Boolean> flights = new HashMap<>();

    public static void setFlights() {
        flights.put("London", true);
        flights.put("Berlin", true);
        flights.put("Oslo", false);
        flights.put("Washington DC", false);
        flights.put("Rome", true);
    }

    public static String findFlight(Flight flight) throws RouteNotFoundException {
        for (Map.Entry<String, Boolean> entry : flights.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport())) {
                if (entry.getValue()) {
                    return "✓ you can fly from " + flight.getDepartureAirport().toUpperCase() +
                            " to " + flight.getArrivalAirport().toUpperCase();
                } else {
                    return  "✗ you can't fly from " + flight.getDepartureAirport().toUpperCase() +
                            " to " + flight.getArrivalAirport().toUpperCase();
                }
            }
        }
        throw new RouteNotFoundException();
    }


    public static void main(String[] args) {
        setFlights();
        Flight london = new Flight("Rome", "London");
        try {
            System.out.println(findFlight(london));
        } catch (RouteNotFoundException exception) {
            System.out.println("✘ no fly from " + london.getDepartureAirport().toUpperCase() +
                    " to " + london.getArrivalAirport().toUpperCase());
        }

        Flight oslo = new Flight("London", "Oslo");
        try {
            System.out.println(findFlight(oslo));
        } catch (RouteNotFoundException exception) {
            System.out.println("✘ no fly from " + oslo.getDepartureAirport().toUpperCase() +
                    " to " + oslo.getArrivalAirport().toUpperCase());
        }

        Flight warsaw = new Flight("Prague", "Warsaw");
        try {
            System.out.println(findFlight(warsaw));
        } catch (RouteNotFoundException exception) {
            System.out.println("✘ no fly from " + warsaw.getDepartureAirport().toUpperCase() +
                    " to " + warsaw.getArrivalAirport().toUpperCase());
        }
    }
}
