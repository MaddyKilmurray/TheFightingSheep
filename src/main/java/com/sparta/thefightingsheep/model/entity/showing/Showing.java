package com.sparta.thefightingsheep.model.entity.showing;

import com.sparta.thefightingsheep.model.entity.movie.Movie;
import com.sparta.thefightingsheep.model.entity.theater.Theater;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.Instant;

@Data
@Document(collection="showings")
public class Showing {
    @MongoId
    private ObjectId id;
    @Field("showing_date")
    private Instant showingDate;
    @DBRef
    private Movie movie;
    @DBRef
    private Theater theater;

    public Showing() {}

    public Showing(Instant showingDate, Movie movie, Theater theater) {
        this.showingDate = showingDate;
        this.movie = movie;
        this.theater = theater;
    }

    public Showing(ObjectId id, Instant showingDate, Movie movie, Theater theater) {
        this.id = id;
        this.showingDate = showingDate;
        this.movie = movie;
        this.theater = theater;
    }
}