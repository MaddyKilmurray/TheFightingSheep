package com.sparta.thefightingsheep.model.theatre.location.geo;

public class Geo {

    private String type;

    private int[] coordinates;

    public Geo(String type, int[] coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }
}
