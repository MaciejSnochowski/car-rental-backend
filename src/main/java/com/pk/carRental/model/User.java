package com.pk.carRental.model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private int days;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public User( long id,String name, String surname, int days) {
        this.id =id;
        this.name = name;
        this.surname = surname;
        this.days = days;
    }

    public User() {
    }
}
