package com.sparta.thefightingsheep.modelm.entity.role;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection="roles")
public class Role {
    @MongoId
    private ObjectId id;
    private String role;

    public Role() {}

    public Role(String role) {
        this.role = role;
    }

    public Role(ObjectId id, String role) {
        this.id = id;
        this.role = role;
    }
}
