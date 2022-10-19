package com.sparta.thefightingsheep.model.theatre.location;

import com.sparta.thefightingsheep.model.theatre.location.address.Address;
import com.sparta.thefightingsheep.model.theatre.location.geo.Geo;

public class Location {

    private Address address;

    private Geo geo;

    public Location(Address address, Geo geo) {
        this.address = address ;
        this.geo = geo;
    }

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
}
