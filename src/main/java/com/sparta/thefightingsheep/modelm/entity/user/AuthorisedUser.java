package com.sparta.thefightingsheep.modelm.entity.user;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection="authorisedusers")
public class AuthorisedUser {
    @MongoId
    private ObjectId id;
    private String username;
    private String password;
    @Field("userRoles")
    private UserRole userRole;

    public AuthorisedUser() {}

    public AuthorisedUser(String username, String password, UserRole userRole) {
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }

    public AuthorisedUser(ObjectId id, String username, String password, UserRole userRole) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }
}
