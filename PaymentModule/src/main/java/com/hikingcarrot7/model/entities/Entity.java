package com.hikingcarrot7.model.entities;

/**
 *
 * @author HikingCarrot7
 */
public abstract class Entity {

    private final String id;

    public Entity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
