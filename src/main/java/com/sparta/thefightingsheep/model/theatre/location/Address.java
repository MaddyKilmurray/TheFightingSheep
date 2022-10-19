package com.sparta.thefightingsheep.model.theatre.location;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.websocket.OnClose;

@Data
public class Address {
    private String city;
    private String state;
    @Field("street1")
    private String streetOne;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetOne() {
        return streetOne;
    }

    public void setStreetOne(String streetOne) {
        this.streetOne = streetOne;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

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
