package com.sonbear.model.database;

import com.sonbear.model.database.utils.CSVParser;
import com.sonbear.model.database.utils.FileContentManager;
import com.sonbear.model.entities.Entity;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HikingCarrot7
 * @param <T>
 */
public abstract class DataAccessService<T extends Entity> {

    protected CSVParser csvParser;
    protected FileContentManager fileContentManager;

    public DataAccessService(String path) {
        try {
            fileContentManager = new FileContentManager(path);
            csvParser = new CSVParser(fileContentManager);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void insertEntity(T entity) {
        List<T> entities = getAllEntities();
        entities.add(entity);
        saveEntities(entities);
    }

    public boolean removeEntity(T entity) {
        List<T> entities = getAllEntities();
        boolean removed = entities.remove(entity);

        if (removed)
            saveEntities(entities);

        return removed;
    }

    public boolean existEntity(String id) {
        List<T> entities = getAllEntities();
        return entities.stream().anyMatch(entity -> entity.getId().equals(id));
    }

    public Optional<T> selectEntityById(String id) {
        List<T> entities = getAllEntities();
        return entities.stream()
                .filter(entity -> entity.getId().equals(id))
                .findFirst();
    }

    public boolean updateEntityById(String id, T entity) {
        List<T> entities = getAllEntities();
        return selectEntityById(id).map(e -> {
            int indexOfEntityToRemove = entities.indexOf(e);
            if (indexOfEntityToRemove >= 0) {
                entities.set(indexOfEntityToRemove, entity);
                saveEntities(entities);
                return true;
            }

            return false;

        }).orElse(false);
    }

    public boolean removeEntityById(String id) {
        List<T> entities = getAllEntities();
        Optional<T> entityMaybe = selectEntityById(id);
        if (entityMaybe.isPresent()) {
            entities.remove(entityMaybe.get());
            saveEntities(entities);
            return true;
        }

        return false;
    }

    public abstract List<T> getAllEntities();

    public abstract void saveEntities(List<T> entities);
}
