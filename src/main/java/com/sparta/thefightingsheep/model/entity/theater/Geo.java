package com.sparta.thefightingsheep.model.entity.theater;

import lombok.Data;

import java.util.List;

@Data
public class Geo {
    private List<Double> coordinates;
    private final String type = "Point";

    public Geo() {}

    public Geo(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
