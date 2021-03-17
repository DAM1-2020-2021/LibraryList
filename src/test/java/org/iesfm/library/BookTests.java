package org.iesfm.library;

import com.sun.source.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class BookTests {

    private Book book;

    @Before
    public void setUp() {
        Set<String> genres = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            genres.add("genre" + i);
        }

        for (String genre :
                genres) {
            System.out.println(genre);
        }

        book = new Book(1, "", "", genres);
    }

    @Test
    public void hasGenreTest() {
        for (int i = 0; i < 100; i++) {
            book.hasGenre("genero");
        }
    }
}
