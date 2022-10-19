package com.sparta.thefightingsheep.model.repository;

import com.sparta.thefightingsheep.model.entity.comment.Comment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, ObjectId> {}
