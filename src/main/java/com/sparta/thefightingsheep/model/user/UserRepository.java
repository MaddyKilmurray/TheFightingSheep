package com.sparta.thefightingsheep.model.user;

import com.sparta.thefightingsheep.model.entity.UsersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UsersEntity, String> {

    @Query("{name:'?0'}")
    Optional<User> findUserByName(String name);
}
