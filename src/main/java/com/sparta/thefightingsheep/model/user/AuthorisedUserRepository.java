package com.sparta.thefightingsheep.model.user;

import com.sparta.thefightingsheep.model.user.AuthorisedUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorisedUserRepository extends MongoRepository<AuthorisedUser, ObjectId> {

    @Query("{_id:'?0'}")
    Optional<AuthorisedUser> findAuthorisedUserById(ObjectId id);
}
