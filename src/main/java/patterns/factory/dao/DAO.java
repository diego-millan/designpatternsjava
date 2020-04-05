package patterns.factory.dao;

import java.util.List;

public interface DAO<E> {
    public E getById(Object id);
    public void save(E entidade);
    public void delete(Object id);
    public List<E> listAll();

}
