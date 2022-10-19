package com.sparta.thefightingsheep.model.theatre.location;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class Location {

    class Address {
        String city;
        String state;
        @Field("street1") String streetOne;
        @Field("zipcode") String zipCode;
    }

    class Geo {
        List<Double> coordinates;
        final String type = "Point";
    }

    Address address;
    Geo geo;
}
