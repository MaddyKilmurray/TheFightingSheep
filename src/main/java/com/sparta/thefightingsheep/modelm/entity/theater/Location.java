package com.sparta.thefightingsheep.modelm.entity.theater;

import lombok.Data;
import lombok.NonNull;

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
