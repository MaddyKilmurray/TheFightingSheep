package com.sparta.thefightingsheep.model.entity.theater;

import lombok.Data;

@Data
public class Location {
    private Address address;
    private Geo geo;

    public Location() {}

    public Location(Address address, Geo geo) {
        this.address = address;
        this.geo = geo;
    }
}