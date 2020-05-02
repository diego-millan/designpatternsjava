package patterns.proxy.dao;

import patterns.proxy.domain.Identifiable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CacheDAO implements DAO {
    private DAO dao;
    private Map<Integer, Identifiable> cache;

    public CacheDAO(DAO dao) {
        this.dao = dao;
        this.cache = new HashMap<>();
    }

    @Override
    public Optional<Identifiable> find(int id) {

        Optional<Identifiable> objectFound = null;

        if (cache.containsKey(id)) {

            objectFound = Optional.of(cache.get(id));

        } else {
            objectFound = dao.find(id);

            if (objectFound.isPresent()) {
                cache.put(id, objectFound.get());
            }
        }

        return objectFound;
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
        cache.remove(id);
    }

    @Override
    public void save(Identifiable obj) {
        dao.save(obj);
        cache.put(obj.getId(), obj);
    }
}
