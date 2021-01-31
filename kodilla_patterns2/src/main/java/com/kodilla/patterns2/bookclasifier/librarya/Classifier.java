package com.kodilla.patterns2.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {

    int publicationYearMedian(Set<Publication> bookSet);
}
