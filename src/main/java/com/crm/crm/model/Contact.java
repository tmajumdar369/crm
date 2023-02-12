package com.crm.crm.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Contact {
    public @Id @GeneratedValue long id;
    public String firstName;
    public String lastName;
    public String email;

    public Contact() {

    }

    /**
     * @param firstName
     * @param lastName
     * @param email
     */
    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
