package org.iesfm.library;

import org.iesfm.library.exception.InvalidCpException;

import java.util.List;

public interface ILibrary {

    List<Book> findBooks(String genre);

    List<Member> findMembers(int cp) throws InvalidCpException;
    // Busca los prestamos de un socio dado su NIF List<BookLend>
    // Busca los libros que ha tomado prestado un socio dado su NIF List<Book>

}
