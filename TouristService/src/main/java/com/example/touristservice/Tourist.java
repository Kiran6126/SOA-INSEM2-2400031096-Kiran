package com.example.touristservice;

public class Tourist {

    private int id;
    private String name;
    private String place;

    // Default constructor
    public Tourist() {
    }

    // Parameterized constructor
    public Tourist(int id, String name, String place) {
        this.id = id;
        this.name = name;
        this.place = place;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Tourist{id=" + id + ", name='" + name + "', place='" + place + "'}";
    }
}
