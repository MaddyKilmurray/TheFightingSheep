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

    @Field("_id")
    @MongoId
    private ObjectId id;

    private String theaterId;
    private Location location;

}
