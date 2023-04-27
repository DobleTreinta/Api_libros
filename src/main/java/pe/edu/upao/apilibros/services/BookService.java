package pe.edu.upao.apilibros.services;

import pe.edu.upao.apilibros.models.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    List<Book> getAllBooks();

}