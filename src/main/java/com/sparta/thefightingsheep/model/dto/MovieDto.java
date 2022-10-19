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

    public MovieDto() {}

    public MovieDto(Object awards, String fullPlot, Integer numMflixComments, String plot, String title, String lastUpdated, String poster, Object tomatoes, Integer year, Object imdb, String rated, Instant imdbId, String type, List<String> directors, List<String> languages, List<String> writers, List<String> genres, List<String> cast, List<String> countries) {
        this.awards = awards;
        this.fullPlot = fullPlot;
        this.numMflixComments = numMflixComments;
        this.plot = plot;
        this.title = title;
        this.lastUpdated = lastUpdated;
        this.poster = poster;
        this.tomatoes = tomatoes;
        this.year = year;
        this.imdb = imdb;
        this.rated = rated;
        this.imdbId = imdbId;
        this.type = type;
        this.directors = directors;
        this.languages = languages;
        this.writers = writers;
        this.genres = genres;
        this.cast = cast;
        this.countries = countries;
    }

    public MovieDto(String id, Object awards, String fullPlot, Integer numMflixComments, String plot, String title, String lastUpdated, String poster, Object tomatoes, Integer year, Object imdb, String rated, Instant imdbId, String type, List<String> directors, List<String> languages, List<String> writers, List<String> genres, List<String> cast, List<String> countries) {
        super(id);
        this.awards = awards;
        this.fullPlot = fullPlot;
        this.numMflixComments = numMflixComments;
        this.plot = plot;
        this.title = title;
        this.lastUpdated = lastUpdated;
        this.poster = poster;
        this.tomatoes = tomatoes;
        this.year = year;
        this.imdb = imdb;
        this.rated = rated;
        this.imdbId = imdbId;
        this.type = type;
        this.directors = directors;
        this.languages = languages;
        this.writers = writers;
        this.genres = genres;
        this.cast = cast;
        this.countries = countries;
    }
}