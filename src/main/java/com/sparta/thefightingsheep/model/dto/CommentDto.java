package com.sparta.thefightingsheep.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.types.ObjectId;

import java.time.Instant;

@Data
@EqualsAndHashCode(callSuper=false)
public class CommentDto extends Dto {
    private Instant date;
    private String email;
    private String movieId;
    private String name;
    private String text;

    public CommentDto() {}

    public CommentDto(Instant date, String email, String movieId, String name, String text) {
        this.date = date;
        this.email = email;
        this.movieId = movieId;
        this.name = name;
        this.text = text;
    }

    public CommentDto(String id, Instant date, String email, String movieId, String name, String text) {
        super(id);
        this.date = date;
        this.email = email;
        this.movieId = movieId;
        this.name = name;
        this.text = text;
    }

    public CommentDto(String id, String date, String email, String movieId, String name, String text) {
    }
}
