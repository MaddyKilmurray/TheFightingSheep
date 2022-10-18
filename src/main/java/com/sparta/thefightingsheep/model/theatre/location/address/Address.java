package com.sparta.thefightingsheep.model.theatre.location.address;

import org.bson.types.ObjectId;

public class Address {

    private String street1;

    private String city;

    private String state;

    private int zipcode;

    public Address(String street1, String city, String state, int zipcode) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
