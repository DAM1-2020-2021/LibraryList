package org.iesfm.library;

import org.iesfm.library.exception.InvalidCpException;
import org.iesfm.library.exception.InvalidMemberException;

import java.util.*;

public class Library implements ILibrary {
    private String name;
    private List<Book> books;
    private List<Member> members;
    private Set<BookLend> bookLends;

    public Library(String name, List<Book> books, List<Member> members, Set<BookLend> bookLends) {
        this.name = name;
        this.books = books;
        this.members = members;
        this.bookLends = bookLends;
    }

    @Override
    public List<Book> findBooks(String genre) {
        List<Book> genreBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.hasGenre(genre)) {
                genreBooks.add(book);
            }
        }
        return genreBooks;
    }


    private Book getBook(int isbn) {
        Book b = null;
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                b = book;
            }
        }
        return b;
    }

    @Override
    public List<Member> findMembers(int cp) throws InvalidCpException {
        if (cp < 1000 || cp > 54000) {
            throw new InvalidCpException();
        }
        List<Member> cpMembers = new ArrayList<>();
        for (Member member : members) {
            if (member.getCp() == cp) {
                cpMembers.add(member);
            }
        }

        return cpMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Set<BookLend> getBookLends() {
        return bookLends;
    }

    public void setBookLends(Set<BookLend> bookLends) {
        this.bookLends = bookLends;
    }


}
