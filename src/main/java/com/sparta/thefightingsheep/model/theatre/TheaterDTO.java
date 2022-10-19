package com.sparta.thefightingsheep.model.theatre;

import com.sparta.thefightingsheep.model.theatre.location.Location;

public class TheaterDTO {

    private int theaterId;

    private Location location;

    public TheaterDTO(int id, Location location) {
        this.theaterId = id;
        this.location = location;
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
