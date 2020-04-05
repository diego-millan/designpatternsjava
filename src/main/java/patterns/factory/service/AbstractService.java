package patterns.factory.service;

import patterns.factory.dao.DAO;
import patterns.template.FileGenerator;

public abstract class AbstractService<E> {

    public FileGenerator generator;

    public AbstractService(FileGenerator generator) {
        this.generator = generator;
    }

    public abstract DAO<E> getDAO();

}
