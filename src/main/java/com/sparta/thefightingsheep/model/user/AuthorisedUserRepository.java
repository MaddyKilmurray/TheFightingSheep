package com.sparta.thefightingsheep.model.user;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface AuthorisedUserRepository extends MongoRepository<AuthorisedUser, ObjectId> {

    @Query("{_id:'?0'}")
    Optional<AuthorisedUser> findAuthorisedUserById(ObjectId id);
}
