package com.kodilla.patterns2.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {

    int averagePublicationYear(Map<BookSignature, Book> books);
    int medianPublicationYear(Map<BookSignature, Book> books);
}
