package com.sparta.thefightingsheep.model.comments.repository;

import com.sparta.thefightingsheep.model.comments.Comment;
import com.sparta.thefightingsheep.model.user.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {

    @Query("{name:'?0'}")
    Optional<Comment> findByName(String name);

    @Query("{_id:'?0'}")
    Optional<Comment> findById(ObjectId id);

    @Query("{email:'?0'}")
    Optional<User> findByEmail(String email);

    @Query("{movie_id:'?0'}")
    Optional<User> findByMovie_id (ObjectId movie_id);

    @Query("{text:'?0'}")
    Optional<User> findByText (String text);
}
