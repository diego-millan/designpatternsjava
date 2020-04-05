package patterns.factory.dao;

import patterns.factory.domain.Product;

import java.util.List;

public class ProductDAO implements DAO<Product> {
    @Override
    public Product getById(Object id) {
        return null;
    }

    @Override
    public void save(Product entidade) {

    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<Product> listAll() {
        return null;
    }
}
