package com.sparta.thefightingsheep.model.theatre;

import com.sparta.thefightingsheep.model.theatre.location.Location;

public class TheaterDTO {

    private int theaterId;

    private Location location;

    public TheaterDTO(int id, String street1, String city, String state, int zipcode, String type, int[] coordinates) {
        this.theaterId = id;
        this.location = new Location(street1, city, state, zipcode, type, coordinates);
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
