package com.sparta.thefightingsheep.model.movie;

import java.io.Serializable;
import java.sql.Array;
import java.sql.Date;
import java.util.Objects;

/**
 * A DTO for the {@link MoviesEntity} entity
 */
public class MoviesEntityDto implements Serializable {
    private final String id;
    private final Object awards;
    private final String fullplot;
    private final Integer numMflixComments;
    private final String plot;
    private final String title;
    private final String lastupdated;
    private final String poster;
    private final Object tomatoes;
    private final Integer year;
    private final Object imdb;
    private final String rated;
    private final Date imdbId;
    private final String type;
    private final Array directors;
    private final Array languages;
    private final Array writers;
    private final Array genres;
    private final Array cast;
    private final Array countries;

    public MoviesEntityDto(String id, Object awards, Array directors, String fullplot, Array languages, Integer numMflixComments, String plot, String title, Array writers, Array genres, String lastupdated, String poster, Object tomatoes, Integer year, Object imdb, String rated, Date imdbId, Array cast, Integer runtime, Array countries, String type) {
        this.id = id;
        this.awards = awards;
        this.fullplot = fullplot;
        this.numMflixComments = numMflixComments;
        this.plot = plot;
        this.title = title;
        this.lastupdated = lastupdated;
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

    public String getId() {
        return id;
    }

    public Object getAwards() {
        return awards;
    }

    public String getFullplot() {
        return fullplot;
    }

    public Integer getNumMflixComments() {
        return numMflixComments;
    }

    public String getPlot() {
        return plot;
    }

    public String getTitle() {
        return title;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public String getPoster() {
        return poster;
    }

    public Object getTomatoes() {
        return tomatoes;
    }
    public Integer getYear() {
        return year;
    }


    public Object getImdb() {
        return imdb;
    }

    public String getRated() {
        return rated;
    }

    public String getType() {
        return type;
    }

    public Object getDirectors() {
        return directors;
    }

    public Object getLanguages() {
        return languages;
    }

    public Object getWriters() {
        return writers;
    }

    public Object getGenres() {
        return genres;
    }

    public Object getCast() {
        return cast;
    }

    public Object getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoviesEntityDto entity = (MoviesEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.awards, entity.awards) &&
                Objects.equals(this.fullplot, entity.fullplot) &&
                Objects.equals(this.numMflixComments, entity.numMflixComments) &&
                Objects.equals(this.plot, entity.plot) &&
                Objects.equals(this.title, entity.title) &&
                Objects.equals(this.lastupdated, entity.lastupdated) &&
                Objects.equals(this.poster, entity.poster) &&
                Objects.equals(this.tomatoes, entity.tomatoes) &&
                Objects.equals(this.year, entity.year) &&
                Objects.equals(this.imdb, entity.imdb) &&
                Objects.equals(this.rated, entity.rated) &&
                Objects.equals(this.imdbId, entity.imdbId) &&
                Objects.equals(this.type, entity.type) &&
                Objects.equals(this.directors, entity.directors) &&
                Objects.equals(this.languages, entity.languages) &&
                Objects.equals(this.writers, entity.writers) &&
                Objects.equals(this.genres, entity.genres) &&
                Objects.equals(this.cast, entity.cast) &&
                Objects.equals(this.countries, entity.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, awards, fullplot, numMflixComments, plot, title, lastupdated, poster, tomatoes, year, imdb, rated, imdbId, type, directors, languages, writers, genres, cast, countries);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "awards = " + awards + ", " +
                "fullplot = " + fullplot + ", " +
                "numMflixComments = " + numMflixComments + ", " +
                "plot = " + plot + ", " +
                "title = " + title + ", " +
                "lastupdated = " + lastupdated + ", " +
                "poster = " + poster + ", " +
                "tomatoes = " + tomatoes + ", " +
                "year = " + year + ", " +
                "imdb = " + imdb + ", " +
                "rated = " + rated + ", " +
                "imdbId = " + imdbId + ", " +
                "type = " + type + ", " +
                "directors = " + directors + ", " +
                "languages = " + languages + ", " +
                "writers = " + writers + ", " +
                "genres = " + genres + ", " +
                "cast = " + cast + ", " +
                "countries = " + countries + ")";
    }
}