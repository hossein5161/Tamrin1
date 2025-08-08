package repository.impl;

import model.Book;
import repository.BookRepository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRepositoryImpl extends BaseRepositoryImpl<Integer, Book> implements BookRepository {
    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, Book entity) throws SQLException {
        preparedStatement.setString(1,entity.getTitle());
        preparedStatement.setString(2,entity.getAuthor());
        preparedStatement.setDouble(3,entity.getPrice());
        preparedStatement.setInt(4,entity.getStock());

    }

    @Override
    public String getCountOfQuestionMark() {
        return "(?,?,?,?)";
    }

    @Override
    public String getColumnName() {
        return "(title, author, price ,stock)";
    }

    @Override
    public String getTableName() {
        return "books";
    }


}
