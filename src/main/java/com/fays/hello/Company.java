package com.fays.hello;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Company {

    // Primary ID which increments
    // automatically when new entry
    // is added into the database
    @Id
    @GeneratedValue
    int id;

    String name;

    // In months
    int duration;
    String profile;

    // Can be 0
    int stipend;
    boolean workFromHome;
    public Company() {

    }


    // Parameterized constructor
    public Company(String name,
                   String profile) {
        this.name = name;
        this.profile = profile;

    }


    // Getters and setters of
    // the variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getProfile() {
        return profile;
    }

    public int getStipend() {
        return stipend;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isWorkFromHome() {
        return workFromHome;
    }
}
