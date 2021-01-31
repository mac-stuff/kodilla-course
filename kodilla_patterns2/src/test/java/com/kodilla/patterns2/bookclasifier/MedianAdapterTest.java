package com.kodilla.patterns2.bookclasifier;

import com.kodilla.patterns2.bookclasifier.librarya.Publication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class MedianAdapterTest {

    @Test
    void publicationYearMedianTest() {
        //Given
        Publication book1 = new Publication("Test Author 1", "Test Title 1", 2005, "ISBN0000");
        Publication book2 = new Publication("Test Author 2", "Test Title 2", 2010, "ISBN1111");
        Publication book3 = new Publication("Test Author 3", "Test Title 3", 2015, "ISBN0000");
        Publication book4 = new Publication("Test Author 4", "Test Title 4", 2020, "ISBN1111");

        Set<Publication> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        Assertions.assertEquals(2015, median);
    }
}
