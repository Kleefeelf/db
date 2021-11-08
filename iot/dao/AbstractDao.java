package iot.dao;

import java.util.List;
import java.sql.SQLException;

public interface AbstractDao<E> {

    List<E> getAll() throws SQLException;

    E get(Integer id) throws SQLException;

    void create(E entity) throws SQLException;

    void update(Integer id, E entity) throws SQLException;

    void delete(Integer id) throws SQLException;
}