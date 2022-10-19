package com.sparta.thefightingsheep.model.comments;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.Instant;

@Data
@Document(collection = "comments")
public class Comment {

    private @MongoId ObjectId _id;

    private Instant date;

    private String email;

    private ObjectId movie_id;

    private String name;

    private String text;

    public Comment(ObjectId _id, Instant date, String email, ObjectId movie_id, String name, String text) {
        this._id = _id;
        this.date = date;
        this.email = email;
        this.movie_id = movie_id;
        this.name = name;
        this.text = text;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ObjectId getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(ObjectId movie_id) {
        this.movie_id = movie_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "_id=" + _id +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", movie_id=" + movie_id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
