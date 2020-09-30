package com.hikingcarrot7.model.database;

import com.hikingcarrot7.model.entities.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HikingCarrot7
 */
public abstract class FakeDataAccessService {

    private final List<Entity> db;

    public FakeDataAccessService() {
        this.db = new ArrayList<>();
    }

    public void insertEntity(Entity entity) {
        db.add(entity);
    }

    public boolean removeEntity(Entity entity) {
        return db.remove(entity);
    }

    public Optional<Entity> selectEntityById(String id) {
        return db.stream()
                .filter(entity -> entity.getId().equals(id))
                .findFirst();
    }

    public boolean updateEntityById(String id, Entity entity) {
        return selectEntityById(id).map(e -> {
            int indexOfEntityToRemove = db.indexOf(e);
            if (indexOfEntityToRemove >= 0) {
                db.set(indexOfEntityToRemove, e);
                return true;
            }

            return false;

        }).orElse(false);
    }

    public boolean removeEntityById(String id) {
        Optional<Entity> entityMaybe = selectEntityById(id);
        if (entityMaybe.isPresent()) {
            db.remove(entityMaybe.get());
            return true;
        }

        return false;
    }

    public List<Entity> getAllEntities() {
        return db;
    }

}
