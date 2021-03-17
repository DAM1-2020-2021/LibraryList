package org.iesfm.library;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private Set<String> genres;

    public Book(int isbn, String title, String author, Set<String> genres) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genres = genres;
    }

    public boolean hasGenre(String genre) {
        return genres.contains(genre);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(genres, book.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, genres);
    }
}
