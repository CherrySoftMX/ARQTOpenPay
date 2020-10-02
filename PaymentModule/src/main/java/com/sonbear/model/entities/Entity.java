package com.sonbear.model.entities;

import java.util.Objects;

/**
 *
 * @author Sonbear
 */
public abstract class Entity {

    private String id;

    public Entity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Entity other = (Entity) obj;
        return Objects.equals(this.id, other.id);
    }

}
