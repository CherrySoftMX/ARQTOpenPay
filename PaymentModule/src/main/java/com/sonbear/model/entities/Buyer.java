package com.sonbear.model.entities;

/**
 *
 * @author HikingCarrot7
 */
public class Buyer extends User {

    public Buyer(String id, String firstName, String lastName, String email, String phoneNumber) {
        super(id, firstName, lastName, email, phoneNumber);
    }

    public Buyer(String firstName, String lastName, String email, String phoneNumber) {
        super(firstName, lastName, email, phoneNumber);
    }

}
