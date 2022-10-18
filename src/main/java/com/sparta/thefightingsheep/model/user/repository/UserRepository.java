package com.sparta.thefightingsheep.model.user.repository;

import com.sparta.thefightingsheep.model.user.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{name:'?0'}")
    Optional<User> findByName(String name);

    @Query("{_id:'?0'}")
    Optional<User> findById(ObjectId id);

    @Query("{email:'?0'}")
    Optional<User> findByEmail(String email);
}
