package com.sparta.thefightingsheep.model.movie;

import com.sparta.thefightingsheep.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MoviesEntityRepository extends MongoRepository<MoviesEntity, String> {

    Optional<User> findUserByName(String name);
}