package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("author 1", "title 1", 2001, "1");
        Book book2 = new Book("author 2", "title 2", 1997, "2");
        Book book3 = new Book("author 3", "title 3", 2010, "3");
        Book book4 = new Book("author 4", "title 4", 1999, "4");

        Set<Book> booksSet = new HashSet<>();
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(booksSet);

        //Then
        assertEquals(2001, median);
    }
}