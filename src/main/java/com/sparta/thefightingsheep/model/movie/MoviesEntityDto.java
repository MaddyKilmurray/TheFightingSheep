package com.sparta.thefightingsheep.model.movie;

import java.io.Serializable;
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
    private final Integer awardsNominations;
    private final String lastupdated;
    private final String poster;
    private final Object tomatoes;
    private final Integer year;
    private final String awardsText;
    private final Object imdb;
    private final String rated;
    private final String tomatoesConsensus;
    private final Integer awardsWins;
    private final Integer imdbId;
    private final Date released;
    private final Object tomatoesCritic;
    private final Double imdbRating;
    private final Integer runtime;
    private final Integer tomatoesCriticMeter;
    private final Integer imdbVotes;
    private final Integer tomatoesCriticNumReviews;
    private final Double tomatoesCriticRating;
    private final Date tomatoesDvd;
    private final Integer tomatoesFresh;
    private final Date tomatoesLastUpdated;
    private final String tomatoesProduction;
    private final Integer tomatoesRotten;
    private final Object tomatoesViewer;
    private final Integer tomatoesViewerMeter;
    private final Integer tomatoesViewerNumReviews;
    private final Double tomatoesViewerRating;
    private final String tomatoesWebsite;
    private final String type;
    private final Object directors;
    private final Object languages;
    private final Object writers;
    private final Object genres;
    private final Object cast;
    private final Object countries;

    public MoviesEntityDto(String id, Object awards, String fullplot, Integer numMflixComments, String plot, String title, Integer awardsNominations, String lastupdated, String poster, Object tomatoes, Integer year, String awardsText, Object imdb, String rated, String tomatoesConsensus, Integer awardsWins, Integer imdbId, Date released, Object tomatoesCritic, Double imdbRating, Integer runtime, Integer tomatoesCriticMeter, Integer imdbVotes, Integer tomatoesCriticNumReviews, Double tomatoesCriticRating, Date tomatoesDvd, Integer tomatoesFresh, Date tomatoesLastUpdated, String tomatoesProduction, Integer tomatoesRotten, Object tomatoesViewer, Integer tomatoesViewerMeter, Integer tomatoesViewerNumReviews, Double tomatoesViewerRating, String tomatoesWebsite, String type, Object directors, Object languages, Object writers, Object genres, Object cast, Object countries) {
        this.id = id;
        this.awards = awards;
        this.fullplot = fullplot;
        this.numMflixComments = numMflixComments;
        this.plot = plot;
        this.title = title;
        this.awardsNominations = awardsNominations;
        this.lastupdated = lastupdated;
        this.poster = poster;
        this.tomatoes = tomatoes;
        this.year = year;
        this.awardsText = awardsText;
        this.imdb = imdb;
        this.rated = rated;
        this.tomatoesConsensus = tomatoesConsensus;
        this.awardsWins = awardsWins;
        this.imdbId = imdbId;
        this.released = released;
        this.tomatoesCritic = tomatoesCritic;
        this.imdbRating = imdbRating;
        this.runtime = runtime;
        this.tomatoesCriticMeter = tomatoesCriticMeter;
        this.imdbVotes = imdbVotes;
        this.tomatoesCriticNumReviews = tomatoesCriticNumReviews;
        this.tomatoesCriticRating = tomatoesCriticRating;
        this.tomatoesDvd = tomatoesDvd;
        this.tomatoesFresh = tomatoesFresh;
        this.tomatoesLastUpdated = tomatoesLastUpdated;
        this.tomatoesProduction = tomatoesProduction;
        this.tomatoesRotten = tomatoesRotten;
        this.tomatoesViewer = tomatoesViewer;
        this.tomatoesViewerMeter = tomatoesViewerMeter;
        this.tomatoesViewerNumReviews = tomatoesViewerNumReviews;
        this.tomatoesViewerRating = tomatoesViewerRating;
        this.tomatoesWebsite = tomatoesWebsite;
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

    public Integer getAwardsNominations() {
        return awardsNominations;
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

    public String getAwardsText() {
        return awardsText;
    }

    public Object getImdb() {
        return imdb;
    }

    public String getRated() {
        return rated;
    }

    public String getTomatoesConsensus() {
        return tomatoesConsensus;
    }

    public Integer getAwardsWins() {
        return awardsWins;
    }

    public Integer getImdbId() {
        return imdbId;
    }

    public Date getReleased() {
        return released;
    }

    public Object getTomatoesCritic() {
        return tomatoesCritic;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Integer getTomatoesCriticMeter() {
        return tomatoesCriticMeter;
    }

    public Integer getImdbVotes() {
        return imdbVotes;
    }

    public Integer getTomatoesCriticNumReviews() {
        return tomatoesCriticNumReviews;
    }

    public Double getTomatoesCriticRating() {
        return tomatoesCriticRating;
    }

    public Date getTomatoesDvd() {
        return tomatoesDvd;
    }

    public Integer getTomatoesFresh() {
        return tomatoesFresh;
    }

    public Date getTomatoesLastUpdated() {
        return tomatoesLastUpdated;
    }

    public String getTomatoesProduction() {
        return tomatoesProduction;
    }

    public Integer getTomatoesRotten() {
        return tomatoesRotten;
    }

    public Object getTomatoesViewer() {
        return tomatoesViewer;
    }

    public Integer getTomatoesViewerMeter() {
        return tomatoesViewerMeter;
    }

    public Integer getTomatoesViewerNumReviews() {
        return tomatoesViewerNumReviews;
    }

    public Double getTomatoesViewerRating() {
        return tomatoesViewerRating;
    }

    public String getTomatoesWebsite() {
        return tomatoesWebsite;
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
                Objects.equals(this.awardsNominations, entity.awardsNominations) &&
                Objects.equals(this.lastupdated, entity.lastupdated) &&
                Objects.equals(this.poster, entity.poster) &&
                Objects.equals(this.tomatoes, entity.tomatoes) &&
                Objects.equals(this.year, entity.year) &&
                Objects.equals(this.awardsText, entity.awardsText) &&
                Objects.equals(this.imdb, entity.imdb) &&
                Objects.equals(this.rated, entity.rated) &&
                Objects.equals(this.tomatoesConsensus, entity.tomatoesConsensus) &&
                Objects.equals(this.awardsWins, entity.awardsWins) &&
                Objects.equals(this.imdbId, entity.imdbId) &&
                Objects.equals(this.released, entity.released) &&
                Objects.equals(this.tomatoesCritic, entity.tomatoesCritic) &&
                Objects.equals(this.imdbRating, entity.imdbRating) &&
                Objects.equals(this.runtime, entity.runtime) &&
                Objects.equals(this.tomatoesCriticMeter, entity.tomatoesCriticMeter) &&
                Objects.equals(this.imdbVotes, entity.imdbVotes) &&
                Objects.equals(this.tomatoesCriticNumReviews, entity.tomatoesCriticNumReviews) &&
                Objects.equals(this.tomatoesCriticRating, entity.tomatoesCriticRating) &&
                Objects.equals(this.tomatoesDvd, entity.tomatoesDvd) &&
                Objects.equals(this.tomatoesFresh, entity.tomatoesFresh) &&
                Objects.equals(this.tomatoesLastUpdated, entity.tomatoesLastUpdated) &&
                Objects.equals(this.tomatoesProduction, entity.tomatoesProduction) &&
                Objects.equals(this.tomatoesRotten, entity.tomatoesRotten) &&
                Objects.equals(this.tomatoesViewer, entity.tomatoesViewer) &&
                Objects.equals(this.tomatoesViewerMeter, entity.tomatoesViewerMeter) &&
                Objects.equals(this.tomatoesViewerNumReviews, entity.tomatoesViewerNumReviews) &&
                Objects.equals(this.tomatoesViewerRating, entity.tomatoesViewerRating) &&
                Objects.equals(this.tomatoesWebsite, entity.tomatoesWebsite) &&
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
        return Objects.hash(id, awards, fullplot, numMflixComments, plot, title, awardsNominations, lastupdated, poster, tomatoes, year, awardsText, imdb, rated, tomatoesConsensus, awardsWins, imdbId, released, tomatoesCritic, imdbRating, runtime, tomatoesCriticMeter, imdbVotes, tomatoesCriticNumReviews, tomatoesCriticRating, tomatoesDvd, tomatoesFresh, tomatoesLastUpdated, tomatoesProduction, tomatoesRotten, tomatoesViewer, tomatoesViewerMeter, tomatoesViewerNumReviews, tomatoesViewerRating, tomatoesWebsite, type, directors, languages, writers, genres, cast, countries);
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
                "awardsNominations = " + awardsNominations + ", " +
                "lastupdated = " + lastupdated + ", " +
                "poster = " + poster + ", " +
                "tomatoes = " + tomatoes + ", " +
                "year = " + year + ", " +
                "awardsText = " + awardsText + ", " +
                "imdb = " + imdb + ", " +
                "rated = " + rated + ", " +
                "tomatoesConsensus = " + tomatoesConsensus + ", " +
                "awardsWins = " + awardsWins + ", " +
                "imdbId = " + imdbId + ", " +
                "released = " + released + ", " +
                "tomatoesCritic = " + tomatoesCritic + ", " +
                "imdbRating = " + imdbRating + ", " +
                "runtime = " + runtime + ", " +
                "tomatoesCriticMeter = " + tomatoesCriticMeter + ", " +
                "imdbVotes = " + imdbVotes + ", " +
                "tomatoesCriticNumReviews = " + tomatoesCriticNumReviews + ", " +
                "tomatoesCriticRating = " + tomatoesCriticRating + ", " +
                "tomatoesDvd = " + tomatoesDvd + ", " +
                "tomatoesFresh = " + tomatoesFresh + ", " +
                "tomatoesLastUpdated = " + tomatoesLastUpdated + ", " +
                "tomatoesProduction = " + tomatoesProduction + ", " +
                "tomatoesRotten = " + tomatoesRotten + ", " +
                "tomatoesViewer = " + tomatoesViewer + ", " +
                "tomatoesViewerMeter = " + tomatoesViewerMeter + ", " +
                "tomatoesViewerNumReviews = " + tomatoesViewerNumReviews + ", " +
                "tomatoesViewerRating = " + tomatoesViewerRating + ", " +
                "tomatoesWebsite = " + tomatoesWebsite + ", " +
                "type = " + type + ", " +
                "directors = " + directors + ", " +
                "languages = " + languages + ", " +
                "writers = " + writers + ", " +
                "genres = " + genres + ", " +
                "cast = " + cast + ", " +
                "countries = " + countries + ")";
    }
}