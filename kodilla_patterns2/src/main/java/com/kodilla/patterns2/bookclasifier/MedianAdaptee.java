package com.kodilla.patterns2.bookclasifier;

import com.kodilla.patterns2.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    private final Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistics.medianPublicationYear(books);
    }
}
