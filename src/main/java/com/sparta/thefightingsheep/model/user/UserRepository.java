package com.sparta.thefightingsheep.model.user;

import com.sparta.thefightingsheep.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{name:'?0'}")
    Optional<User> findUserByName(String name);
}
