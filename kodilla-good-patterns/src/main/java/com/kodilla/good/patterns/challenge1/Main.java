package com.kodilla.good.patterns.challenge1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> books = movieStore.getMovies();
        String titles = books.entrySet()
                .stream()
                .flatMap(p->p.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(titles);
    }
}
