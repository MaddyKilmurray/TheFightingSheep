package com.sparta.thefightingsheep.model.repository;

import com.sparta.thefightingsheep.model.entity.user.AuthorisedUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AuthorisedUserRepository extends MongoRepository<AuthorisedUser, ObjectId> {
    @Query("{ 'username' : '?0' }")
    AuthorisedUser findAuthorisedUserByUsername(String username);
}
