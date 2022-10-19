package com.sparta.thefightingsheep.model.dto;

import com.sparta.thefightingsheep.model.entity.movie.Movie;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;
import java.util.List;

/**
 * A DTO for the {@link Movie} entity
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class MovieDto extends Dto {
    private Object awards;
    private String fullPlot;
    private Integer numMflixComments;
    private String plot;
    private String title;
    private String lastUpdated;
    private String poster;
    private Object tomatoes;
    private Integer year;
    private Object imdb;
    private String rated;
    private Instant imdbId;
    private String type;
    private List<String> directors;
    private List<String> languages;
    private List<String> writers;
    private List<String> genres;
    private List<String> cast;
    private List<String> countries;
}