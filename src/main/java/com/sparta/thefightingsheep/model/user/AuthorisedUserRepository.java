package com.sparta.thefightingsheep.model.user;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AuthorisedUserRepository extends MongoRepository<AuthorisedUser, ObjectId> {

    Optional<AuthorisedUser> findAuthorisedUserById(ObjectId id);
}
