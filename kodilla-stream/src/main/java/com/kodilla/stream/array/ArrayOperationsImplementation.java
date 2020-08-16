package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class ArrayAverage implements ArrayOperations {

    @Override
    public double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(i -> i = numbers[i])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .map(i -> i = numbers[i])
                .average().getAsDouble();
    }
}

