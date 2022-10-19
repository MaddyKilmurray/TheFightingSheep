package com.sparta.thefightingsheep.model.movie;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.sql.Array;
import java.sql.Date;

@Document(collection="movies")
public class Movies {
    @MongoId
    private String id;

    private Object awards;

    private String fullplot;

    private Integer numMflixComments;

    private String plot;

    private String title;

    private Integer awardsNominations;

    private String lastupdated;

    private String poster;

    private Object tomatoes;

    private Integer year;

    private String awardsText;

    private Object imdb;

    private String rated;

    private String tomatoesConsensus;

    private Integer awardsWins;

    private Integer imdbId;

    private Date released;

    private Object tomatoesCritic;

    private Double imdbRating;

    private Integer runtime;

    private Integer tomatoesCriticMeter;

    private Integer imdbVotes;

    private Integer tomatoesCriticNumReviews;

    private Double tomatoesCriticRating;

    private Date tomatoesDvd;

    private Integer tomatoesFresh;

    private Date tomatoesLastUpdated;

    private String tomatoesProduction;

    private Integer tomatoesRotten;

    private Object tomatoesViewer;

    private Integer tomatoesViewerMeter;

    private Integer tomatoesViewerNumReviews;

    private Double tomatoesViewerRating;

    private String tomatoesWebsite;

    private String type;
    private Array directors;
    private Array languages;
    private Array writers;
    private Array genres;
    private Array cast;
    private Array countries;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getAwards() {
        return awards;
    }

    public void setAwards(Object awards) {
        this.awards = awards;
    }

    public String getFullplot() {
        return fullplot;
    }

    public void setFullplot(String fullplot) {
        this.fullplot = fullplot;
    }

    public Integer getNumMflixComments() {
        return numMflixComments;
    }

    public void setNumMflixComments(Integer numMflixComments) {
        this.numMflixComments = numMflixComments;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAwardsNominations() {
        return awardsNominations;
    }

    public void setAwardsNominations(Integer awardsNominations) {
        this.awardsNominations = awardsNominations;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Object getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(Object tomatoes) {
        this.tomatoes = tomatoes;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAwardsText() {
        return awardsText;
    }

    public void setAwardsText(String awardsText) {
        this.awardsText = awardsText;
    }

    public Object getImdb() {
        return imdb;
    }

    public void setImdb(Object imdb) {
        this.imdb = imdb;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getTomatoesConsensus() {
        return tomatoesConsensus;
    }

    public void setTomatoesConsensus(String tomatoesConsensus) {
        this.tomatoesConsensus = tomatoesConsensus;
    }

    public Integer getAwardsWins() {
        return awardsWins;
    }

    public void setAwardsWins(Integer awardsWins) {
        this.awardsWins = awardsWins;
    }

    public Integer getImdbId() {
        return imdbId;
    }

    public void setImdbId(Integer imdbId) {
        this.imdbId = imdbId;
    }

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public Object getTomatoesCritic() {
        return tomatoesCritic;
    }

    public void setTomatoesCritic(Object tomatoesCritic) {
        this.tomatoesCritic = tomatoesCritic;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Integer getTomatoesCriticMeter() {
        return tomatoesCriticMeter;
    }

    public void setTomatoesCriticMeter(Integer tomatoesCriticMeter) {
        this.tomatoesCriticMeter = tomatoesCriticMeter;
    }

    public Integer getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(Integer imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public Integer getTomatoesCriticNumReviews() {
        return tomatoesCriticNumReviews;
    }

    public void setTomatoesCriticNumReviews(Integer tomatoesCriticNumReviews) {
        this.tomatoesCriticNumReviews = tomatoesCriticNumReviews;
    }

    public Double getTomatoesCriticRating() {
        return tomatoesCriticRating;
    }

    public void setTomatoesCriticRating(Double tomatoesCriticRating) {
        this.tomatoesCriticRating = tomatoesCriticRating;
    }

    public Date getTomatoesDvd() {
        return tomatoesDvd;
    }

    public void setTomatoesDvd(Date tomatoesDvd) {
        this.tomatoesDvd = tomatoesDvd;
    }

    public Integer getTomatoesFresh() {
        return tomatoesFresh;
    }

    public void setTomatoesFresh(Integer tomatoesFresh) {
        this.tomatoesFresh = tomatoesFresh;
    }

    public Date getTomatoesLastUpdated() {
        return tomatoesLastUpdated;
    }

    public void setTomatoesLastUpdated(Date tomatoesLastUpdated) {
        this.tomatoesLastUpdated = tomatoesLastUpdated;
    }

    public String getTomatoesProduction() {
        return tomatoesProduction;
    }

    public void setTomatoesProduction(String tomatoesProduction) {
        this.tomatoesProduction = tomatoesProduction;
    }

    public Integer getTomatoesRotten() {
        return tomatoesRotten;
    }

    public void setTomatoesRotten(Integer tomatoesRotten) {
        this.tomatoesRotten = tomatoesRotten;
    }

    public Object getTomatoesViewer() {
        return tomatoesViewer;
    }

    public void setTomatoesViewer(Object tomatoesViewer) {
        this.tomatoesViewer = tomatoesViewer;
    }

    public Integer getTomatoesViewerMeter() {
        return tomatoesViewerMeter;
    }

    public void setTomatoesViewerMeter(Integer tomatoesViewerMeter) {
        this.tomatoesViewerMeter = tomatoesViewerMeter;
    }

    public Integer getTomatoesViewerNumReviews() {
        return tomatoesViewerNumReviews;
    }

    public void setTomatoesViewerNumReviews(Integer tomatoesViewerNumReviews) {
        this.tomatoesViewerNumReviews = tomatoesViewerNumReviews;
    }

    public Double getTomatoesViewerRating() {
        return tomatoesViewerRating;
    }

    public void setTomatoesViewerRating(Double tomatoesViewerRating) {
        this.tomatoesViewerRating = tomatoesViewerRating;
    }

    public String getTomatoesWebsite() {
        return tomatoesWebsite;
    }

    public void setTomatoesWebsite(String tomatoesWebsite) {
        this.tomatoesWebsite = tomatoesWebsite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Array getDirectors() {
        return directors;
    }

    public void setDirectors(Array directors) {
        this.directors = directors;
    }

    public Array getLanguages() {
        return languages;
    }

    public void setLanguages(Array languages) {
        this.languages = languages;
    }

    public Array getWriters() {
        return writers;
    }

    public void setWriters(Array writers) {
        this.writers = writers;
    }

    public Array getGenres() {
        return genres;
    }

    public void setGenres(Array genres) {
        this.genres = genres;
    }

    public Array getCast() {
        return cast;
    }

    public void setCast(Array cast) {
        this.cast = cast;
    }

    public Array getCountries() {
        return countries;
    }

    public void setCountries(Array countries) {
        this.countries = countries;
    }
}
