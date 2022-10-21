package com.sparta.thefightingsheep.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

@Data
@EqualsAndHashCode(callSuper=false)
public class ShowingDto extends Dto {
    private Instant showingDate;
    private MovieDto movie;
    private TheaterDto theater;

    public ShowingDto() {}

    public ShowingDto(Instant showingDate, MovieDto movie, TheaterDto theater) {
        this.showingDate = showingDate;
        this.movie = movie;
        this.theater = theater;
    }

    public ShowingDto(String id, Instant showingDate, MovieDto movie, TheaterDto theater) {
        super(id);
        this.showingDate = showingDate;
        this.movie = movie;
        this.theater = theater;
    }
}
