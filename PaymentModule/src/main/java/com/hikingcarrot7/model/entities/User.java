package com.hikingcarrot7.model.entities;

/**
 *
 * @author HikingCarrot7
 */
public abstract class User extends Entity {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public User(String id, String firstName, String lastName, String email, String phoneNumber) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Entity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Entity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Entity setEmail(String email) {
        this.email = email;
        return this;
    }

    public Entity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
