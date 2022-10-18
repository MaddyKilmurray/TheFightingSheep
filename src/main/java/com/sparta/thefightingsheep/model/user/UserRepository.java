package com.sparta.thefightingsheep.model.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{name:'?0'}")
    Optional<User> findUserByName(String name);
}
