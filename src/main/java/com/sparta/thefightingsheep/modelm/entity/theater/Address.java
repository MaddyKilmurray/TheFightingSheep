package com.sparta.thefightingsheep.modelm.entity.theater;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Address {
    private String city;
    private String state;
    @Field("street1")
    private String streetOne;
    @Field("zipcode")
    private String zipCode;

    public Address() {}

    public Address(String city, String state, String streetOne, String zipCode) {
        this.city = city;
        this.state = state;
        this.streetOne = streetOne;
        this.zipCode = zipCode;
    }
}
