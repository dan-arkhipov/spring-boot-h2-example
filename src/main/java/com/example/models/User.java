package com.example.models;

import javax.persistence.*;

/**
 * Created by Daniil Arkhipov on 18/05/2017.
 */

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(columnDefinition="varchar(64)")
    private String firstName;
    @Column(columnDefinition="varchar(64)")
    private String lastName;
    @Column(columnDefinition="varchar(120)")
    private String username;
    @Column(columnDefinition="varchar(120)")
    private String hashedPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
