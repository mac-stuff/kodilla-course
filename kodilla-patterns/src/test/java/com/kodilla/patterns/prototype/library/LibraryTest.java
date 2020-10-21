package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTest {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Favorite Books");
        Book misery = new Book("Misery", "Stephen King", LocalDate.of(1987, 1, 1));
        library.getBooks().add(misery);
        library.getBooks().add(new Book("Desperation", "Stephen King", LocalDate.of(1997, 1, 1)));
        library.getBooks().add(new Book("Carrie", "Stephen King", LocalDate.of(1976, 1, 1)));
        library.getBooks().add(new Book("O Diário de um Mago", "Paulo Coelho", LocalDate.of(1987, 1, 1)));
        library.getBooks().add(new Book("O Alquimista", "Paulo Coelho", LocalDate.of(1988, 1, 1)));
        library.getBooks().add(new Book("Veronika decide morrer", "Paulo Coelho", LocalDate.of(1998, 1, 1)));

        //making a shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library shallow");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library deep");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.getBooks().remove(misery);

        //Then
        assertEquals(5, library.getBooks().size());
        assertEquals(5, clonedLibrary.getBooks().size());
        assertEquals(6, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
