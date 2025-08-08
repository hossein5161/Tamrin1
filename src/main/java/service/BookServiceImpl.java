package service;

import model.Book;
import repository.BookRepository;

import java.sql.SQLException;

public class BookServiceImpl implements BookService {
   private BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) throws SQLException {
        bookRepository.create(book);
    }
}
