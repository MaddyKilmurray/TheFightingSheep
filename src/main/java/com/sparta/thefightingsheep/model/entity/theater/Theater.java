package com.sparta.thefightingsheep.model.entity.theater;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection="theaters")
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
}