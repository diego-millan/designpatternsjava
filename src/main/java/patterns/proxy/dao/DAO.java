package patterns.proxy.dao;

import patterns.proxy.domain.Identifiable;

import java.util.Optional;

public interface DAO {
    public Optional<Identifiable> find(int id);

    public void delete(int id);

    public void save(Identifiable obj);
}
