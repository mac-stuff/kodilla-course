package com.kodilla.good.patterns.challenge4;

import java.util.Objects;

public class Flight {

    private final String from;
    private final String to;
    private final String departures;

    public Flight(String from, String to, String departures) {
        this.from = from;
        this.to = to;
        this.departures = departures;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to) &&
                Objects.equals(departures, flight.departures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, departures);
    }

    @Override
    public String toString() {
        return "Flight from: " + from +
                ", to: " + to +
                ", departures: " + departures + ".";
    }
}
