package com.sparta.thefightingsheep.model.dto;

import com.sparta.thefightingsheep.model.entity.theater.Location;

public class TheaterDto {

    private int theaterId;

    private Location location;

    public TheaterDto(int id, Location location) {
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
