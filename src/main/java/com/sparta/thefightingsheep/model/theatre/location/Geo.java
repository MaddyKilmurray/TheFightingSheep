package com.sparta.thefightingsheep.model.theatre.location;

import lombok.Data;
import org.springframework.data.annotation.PersistenceCreator;

import java.util.List;

@Data
public class Geo {
    private List<Double> coordinates;
    private final String type = "Point";


    public Geo() {}


    public Geo(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }
}
