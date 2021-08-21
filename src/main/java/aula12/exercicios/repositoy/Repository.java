package aula12.exercicios.repositoy;

import java.sql.SQLException;
import java.util.List;

public interface Repository<E> {

    public List<E> findAll() throws SQLException, ClassNotFoundException;

    public E findById(Long id) throws SQLException, ClassNotFoundException;
}