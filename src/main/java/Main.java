import model.Book;
import repository.impl.BookRepositoryImpl;
import service.BookService;
import service.BookServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        BookService bookService = new BookServiceImpl(new BookRepositoryImpl());
        Book book = new Book("title1","author1",1400,5);
        bookService.addBook(book);
    }
}
