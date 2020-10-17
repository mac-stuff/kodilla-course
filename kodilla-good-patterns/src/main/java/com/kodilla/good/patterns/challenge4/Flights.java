package com.kodilla.good.patterns.challenge4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Flights {

    private final Set<Flight> flights = new HashSet<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public Set<Flight> getFlights() {
        return Collections.unmodifiableSet(flights);
    }
}
