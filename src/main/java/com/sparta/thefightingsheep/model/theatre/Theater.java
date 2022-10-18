package com.sparta.thefightingsheep.model.theatre;

import com.sparta.thefightingsheep.model.theatre.location.Location;
import com.sparta.thefightingsheep.model.theatre.location.address.Address;
import com.sparta.thefightingsheep.model.theatre.location.geo.Geo;
import org.springframework.data.annotation.Id;

public class Theater {

    @Id
    private int theaterId;

    private Location location;

    public Theater(int id, Location location) {
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

    @Override
    public String toString() {
        return "Response {" +
                "theaterId=" + theaterId +
                ", location=" + location +
                '}';
    }
}
