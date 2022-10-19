package com.sparta.thefightingsheep.modelm.entity.movie;

import com.mongodb.lang.Nullable;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection="movies")
public class Movie {
    @MongoId
    private ObjectId id;
    private Awards awards;
    @Nullable
    private List<String> cast;
    @Nullable
    private List<String> countries;
    @Nullable
    private List<String> directors;
    @Nullable
    @Field("fullplot")
    private String fullPlot;
    @Nullable
    private List<String> genres;
    private Imdb imdb;
    @Field("lastupdated")
    private LocalDateTime lastUpdated;
    @Field("num_mflix_comments")
    private Integer numMflixComments;
    @Nullable
    private String plot;
    @Nullable
    @Field("rated")
    private Rating rating;
    @Nullable
    private Integer runtime;
    private String title;
    @Nullable
    private Tomatoes tomatoes;
    private String type;
    private Integer year;
    @Nullable
    private List<String> languages;
    @Nullable
    private String poster;
    @Nullable
    private List<String> writers;

    public Movie() {}

    public Movie(Awards awards, Imdb imdb, LocalDateTime lastUpdated, Integer numMflixComments, String title, String type, Integer year) {
        this.awards = awards;
        this.imdb = imdb;
        this.lastUpdated = lastUpdated;
        this.numMflixComments = numMflixComments;
        this.title = title;
        this.type = type;
        this.year = year;
    }

    public Movie(Awards awards, @Nullable List<String> cast, @Nullable List<String> countries, @Nullable List<String> directors, @Nullable String fullPlot, @Nullable List<String> genres, Imdb imdb, LocalDateTime lastUpdated, Integer numMflixComments, @Nullable String plot, @Nullable Rating rating, @Nullable Integer runtime, String title, @Nullable Tomatoes tomatoes, String type, Integer year, @Nullable List<String> languages, @Nullable String poster, @Nullable List<String> writers) {
        this.awards = awards;
        this.cast = cast;
        this.countries = countries;
        this.directors = directors;
        this.fullPlot = fullPlot;
        this.genres = genres;
        this.imdb = imdb;
        this.lastUpdated = lastUpdated;
        this.numMflixComments = numMflixComments;
        this.plot = plot;
        this.rating = rating;
        this.runtime = runtime;
        this.title = title;
        this.tomatoes = tomatoes;
        this.type = type;
        this.year = year;
        this.languages = languages;
        this.poster = poster;
        this.writers = writers;
    }

    public Movie(ObjectId id, Awards awards, @Nullable List<String> cast, @Nullable List<String> countries, @Nullable List<String> directors, @Nullable String fullPlot, @Nullable List<String> genres, Imdb imdb, LocalDateTime lastUpdated, Integer numMflixComments, @Nullable String plot, @Nullable Rating rating, @Nullable Integer runtime, String title, @Nullable Tomatoes tomatoes, String type, Integer year, @Nullable List<String> languages, @Nullable String poster, @Nullable List<String> writers) {
        this.id = id;
        this.awards = awards;
        this.cast = cast;
        this.countries = countries;
        this.directors = directors;
        this.fullPlot = fullPlot;
        this.genres = genres;
        this.imdb = imdb;
        this.lastUpdated = lastUpdated;
        this.numMflixComments = numMflixComments;
        this.plot = plot;
        this.rating = rating;
        this.runtime = runtime;
        this.title = title;
        this.tomatoes = tomatoes;
        this.type = type;
        this.year = year;
        this.languages = languages;
        this.poster = poster;
        this.writers = writers;
    }
}
