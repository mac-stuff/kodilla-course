package com.kodilla.patterns2.bookclasifier;

import com.kodilla.patterns2.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.bookclasifier.librarya.Publication;
import com.kodilla.patterns2.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Publication> bookSet) {

        Map<BookSignature, Book> books = new HashMap<>();

        for (Publication book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            Book bookTypeB = new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            books.put(bookSignature, bookTypeB);
        }
        return medianPublicationYear(books);
    }
}
