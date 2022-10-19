package com.sparta.thefightingsheep.modelm.entity.showing;

import com.sparta.thefightingsheep.modelm.entity.movie.Movie;
import com.sparta.thefightingsheep.modelm.entity.theater.Theater;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Data
@Document(collection="showings")
public class Showing {
    @MongoId
    private ObjectId id;
    @Field("showing_date")
    private LocalDateTime showingDate;
    @DBRef
    private Movie movie;
    @DBRef
    private Theater theater;

    public Showing() {}

    public Showing(LocalDateTime showingDate, Movie movie, Theater theater) {
        this.showingDate = showingDate;
        this.movie = movie;
        this.theater = theater;
    }

    public Showing(ObjectId id, LocalDateTime showingDate, Movie movie, Theater theater) {
        this.id = id;
        this.showingDate = showingDate;
        this.movie = movie;
        this.theater = theater;
    }
}
