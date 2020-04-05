package patterns.factory.service;

import patterns.factory.dao.DAO;
import patterns.factory.dao.ProductDAO;
import patterns.factory.domain.Product;
import patterns.template.FileGenerator;

public class ProductService extends AbstractService<Product> {

    private DAO<Product> dao;

    public ProductService(FileGenerator generator) {
        super(generator);
    }

    // Hook Method
    @Override
    public DAO<Product> getDAO() {

        if (dao == null) {
            dao = new ProductDAO();
        }

        return dao;
    }

    public double getProductPrice(Object productId) {
        Product product = getDAO().getById(productId);
        return product.getPrice();
    }
}
