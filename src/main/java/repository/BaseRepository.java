package repository;

import java.sql.SQLException;
import java.util.List;

public interface BaseRepository<ID ,TYPE> {

    void create(TYPE entity) throws SQLException;
    TYPE read(ID id);
    void update(ID id,TYPE entity);
    void delete(ID id);
    List<TYPE> findAll();
}
