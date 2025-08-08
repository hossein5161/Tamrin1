package service;

import model.Book;

import java.sql.SQLException;

public interface BookService {
    void addBook(Book book) throws SQLException;
}
