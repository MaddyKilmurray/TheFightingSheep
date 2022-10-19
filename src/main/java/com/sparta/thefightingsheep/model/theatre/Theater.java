package com.sparta.thefightingsheep.model.theatre;

import com.sparta.thefightingsheep.modelm.entity.theater.Location;
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
    private com.sparta.thefightingsheep.modelm.entity.theater.Location location;

    public Theater() {}

    public Theater(Integer theaterId, com.sparta.thefightingsheep.modelm.entity.theater.Location location) {
        this.theaterId = theaterId;
        this.location = location;
    }

    public Theater(ObjectId id, Integer theaterId, Location location) {
        this.id = id;
        this.theaterId = theaterId;
        this.location = location;
    }
}
