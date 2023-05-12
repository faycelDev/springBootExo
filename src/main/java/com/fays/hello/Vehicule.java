package com.fays.hello;

public class Vehicule {

    public String color;
    public String marque;
    public boolean gps;
    public int id;

    public Vehicule(String color, String marque, boolean gps, int id)
    {
        this.color = color;
        this.marque = marque;
        this.gps = gps;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = this.marque;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
}
