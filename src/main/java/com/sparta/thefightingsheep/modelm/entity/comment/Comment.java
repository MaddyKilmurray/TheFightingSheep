package com.sparta.thefightingsheep.modelm.entity.comment;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Data
@Document("comments")
public class Comment {
    @MongoId
    private ObjectId id;
    private LocalDateTime date;
    private String email;
    @Field("movie_id")
    private ObjectId movieId;
    private String name;
    private String text;

    public Comment() {}

    public Comment(LocalDateTime date, String email, ObjectId movieId, String name, String text) {
        this.date = date;
        this.email = email;
        this.movieId = movieId;
        this.name = name;
        this.text = text;
    }

    public Comment(ObjectId id, LocalDateTime date, String email, ObjectId movieId, String name, String text) {
        this.id = id;
        this.date = date;
        this.email = email;
        this.movieId = movieId;
        this.name = name;
        this.text = text;
    }
}
