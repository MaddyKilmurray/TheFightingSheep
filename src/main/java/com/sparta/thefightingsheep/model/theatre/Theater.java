package com.sparta.thefightingsheep.model.theatre;

import com.sparta.thefightingsheep.model.theatre.location.Location;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "theaters")
public class Theater {

    @MongoId
    private ObjectId id;
    private Integer theaterId;
    private Location location;

    public Theater() {}

    public Theater(Integer theaterId, Location location) {
        this.theaterId = theaterId;
        this.location = location;
    }

    public Theater(ObjectId id, Integer theaterId, Location location) {
        this.id = id;
        this.theaterId = theaterId;
        this.location = location;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
