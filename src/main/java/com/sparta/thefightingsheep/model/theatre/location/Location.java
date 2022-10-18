package com.sparta.thefightingsheep.model.theatre.location;

import com.sparta.thefightingsheep.model.theatre.location.address.Address;
import com.sparta.thefightingsheep.model.theatre.location.geo.Geo;

public class Location {

    private Address address;

    private Geo geo;

    public Location(String street1, String city, String state, int zipcode, String type, int[] coordinates) {
        this.address = new Address(street1, city, state, zipcode) ;
        this.geo = new Geo(type, coordinates);
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
