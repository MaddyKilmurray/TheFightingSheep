package com.sparta.thefightingsheep.model.theatre.location;
import lombok.Data;

@Data
public class Location {
    private Address address;
    private Geo geo;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Location() {}

    public Location(Address address, Geo geo) {
        this.address = address;
        this.geo = geo;
    }
}
