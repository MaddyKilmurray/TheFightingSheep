package com.sparta.thefightingsheep.model.entity.theater;

import lombok.Data;

import java.util.List;

@Data
public class Geo {
    private List<Double> coordinates;
    private String type = "Point";

    /**
     * This is a dummy setter.
     * The {@code type} property will always be {@code "Point"}.
     * @param type a throwaway {@code type} parameter
     */
    public void setType(String type) {}

    public Geo() {}

    public Geo(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}