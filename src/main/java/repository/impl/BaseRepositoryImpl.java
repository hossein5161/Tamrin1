package repository.impl;

import repository.BaseRepository;
import util.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseRepositoryImpl<ID,TYPE> implements BaseRepository<ID,TYPE> {

    @Override
    public void create(TYPE entity) throws SQLException {
        String query = "insert into " + getTableName() + getColumnName() + " values " + getCountOfQuestionMark();
        try(PreparedStatement preparedStatement = new DatabaseConnection().getConnection().prepareStatement(query)){
            fillParamForStatement(preparedStatement,entity);
            preparedStatement.execute();
        }


    }

    public abstract void fillParamForStatement(PreparedStatement preparedStatement, TYPE entity) throws SQLException;

    public abstract String getCountOfQuestionMark();

    public abstract String getColumnName();

    public abstract String getTableName();

    @Override
    public TYPE read(ID id) {
        return null;
    }

    @Override
    public void update(ID id, TYPE entity) {

    }

    @Override
    public void delete(ID id) {

    }

    @Override
    public List<TYPE> findAll() {
        return List.of();
    }
}
