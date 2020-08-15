package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final List<Country> continent = new ArrayList<>();

    public void setCountry(Country country) {
        continent.add(country);
    }

    public List<Country> getContinent() {
        return continent;
    }
}
