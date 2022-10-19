package com.sparta.thefightingsheep.model.theatre.location;

import com.sparta.thefightingsheep.modelm.entity.theater.Address;
import com.sparta.thefightingsheep.modelm.entity.theater.Geo;
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
