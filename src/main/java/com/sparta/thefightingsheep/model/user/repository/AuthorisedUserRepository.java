package com.sparta.thefightingsheep.model.user.repository;

import com.sparta.thefightingsheep.model.user.AuthorisedUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorisedUserRepository extends MongoRepository<AuthorisedUser, String> {

    AuthorisedUser findById(ObjectId id);

    @Query("{ 'username' : '?0' }")
    AuthorisedUser findAuthorisedUserByUsername(String username);
}
