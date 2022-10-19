package com.sparta.thefightingsheep.modelm.entity.user;

import com.sparta.thefightingsheep.modelm.entity.role.Role;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
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
    @DBRef
    private Role userRole;

    public AuthorisedUser() {}

    public AuthorisedUser(String username, String password, Role userRole) {
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }

    public AuthorisedUser(ObjectId id, String username, String password, Role userRole) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }
}
