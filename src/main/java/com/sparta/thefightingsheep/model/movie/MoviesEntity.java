package com.sparta.thefightingsheep.model.movie;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "movies", schema = "sample_mflix")
public class MoviesEntity {
    @Id
    @Column(name = "_id", nullable = false)
    private String id;
    @Basic
    @Column(name = "awards")
    private Object awards;
    @Basic
    @Column(name = "fullplot")
    private String fullplot;
    @Basic
    @Column(name = "num_mflix_comments")
    private Integer numMflixComments;
    @Basic
    @Column(name = "plot")
    private String plot;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "awards.nominations")
    private Integer awardsNominations;
    @Basic
    @Column(name = "lastupdated")
    private String lastupdated;
    @Basic
    @Column(name = "poster")
    private String poster;
    @Basic
    @Column(name = "tomatoes")
    private Object tomatoes;
    @Basic
    @Column(name = "year")
    private Integer year;
    @Basic
    @Column(name = "awards.text")
    private String awardsText;
    @Basic
    @Column(name = "imdb")
    private Object imdb;
    @Basic
    @Column(name = "rated")
    private String rated;
    @Basic
    @Column(name = "tomatoes.consensus")
    private String tomatoesConsensus;
    @Basic
    @Column(name = "awards.wins")
    private Integer awardsWins;
    @Basic
    @Column(name = "imdb.id")
    private Integer imdbId;
    @Basic
    @Column(name = "released")
    private Date released;
    @Basic
    @Column(name = "tomatoes.critic")
    private Object tomatoesCritic;
    @Basic
    @Column(name = "imdb.rating")
    private Double imdbRating;
    @Basic
    @Column(name = "runtime")
    private Integer runtime;
    @Basic
    @Column(name = "tomatoes.critic.meter")
    private Integer tomatoesCriticMeter;
    @Basic
    @Column(name = "imdb.votes")
    private Integer imdbVotes;
    @Basic
    @Column(name = "tomatoes.critic.numReviews")
    private Integer tomatoesCriticNumReviews;
    @Basic
    @Column(name = "tomatoes.critic.rating")
    private Double tomatoesCriticRating;
    @Basic
    @Column(name = "tomatoes.dvd")
    private Date tomatoesDvd;
    @Basic
    @Column(name = "tomatoes.fresh")
    private Integer tomatoesFresh;
    @Basic
    @Column(name = "tomatoes.lastUpdated")
    private Date tomatoesLastUpdated;
    @Basic
    @Column(name = "tomatoes.production")
    private String tomatoesProduction;
    @Basic
    @Column(name = "tomatoes.rotten")
    private Integer tomatoesRotten;
    @Basic
    @Column(name = "tomatoes.viewer")
    private Object tomatoesViewer;
    @Basic
    @Column(name = "tomatoes.viewer.meter")
    private Integer tomatoesViewerMeter;
    @Basic
    @Column(name = "tomatoes.viewer.numReviews")
    private Integer tomatoesViewerNumReviews;
    @Basic
    @Column(name = "tomatoes.viewer.rating")
    private Double tomatoesViewerRating;
    @Basic
    @Column(name = "tomatoes.website")
    private String tomatoesWebsite;
    @Basic
    @Column(name = "type")
    private String type;
    private Object directors;
    private Object languages;
    private Object writers;
    private Object genres;
    private Object cast;
    private Object countries;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoviesEntity that = (MoviesEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (awards != null ? !awards.equals(that.awards) : that.awards != null) return false;
        if (fullplot != null ? !fullplot.equals(that.fullplot) : that.fullplot != null) return false;
        if (numMflixComments != null ? !numMflixComments.equals(that.numMflixComments) : that.numMflixComments != null)
            return false;
        if (plot != null ? !plot.equals(that.plot) : that.plot != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (awardsNominations != null ? !awardsNominations.equals(that.awardsNominations) : that.awardsNominations != null)
            return false;
        if (lastupdated != null ? !lastupdated.equals(that.lastupdated) : that.lastupdated != null) return false;
        if (poster != null ? !poster.equals(that.poster) : that.poster != null) return false;
        if (tomatoes != null ? !tomatoes.equals(that.tomatoes) : that.tomatoes != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (awardsText != null ? !awardsText.equals(that.awardsText) : that.awardsText != null) return false;
        if (imdb != null ? !imdb.equals(that.imdb) : that.imdb != null) return false;
        if (rated != null ? !rated.equals(that.rated) : that.rated != null) return false;
        if (tomatoesConsensus != null ? !tomatoesConsensus.equals(that.tomatoesConsensus) : that.tomatoesConsensus != null)
            return false;
        if (awardsWins != null ? !awardsWins.equals(that.awardsWins) : that.awardsWins != null) return false;
        if (imdbId != null ? !imdbId.equals(that.imdbId) : that.imdbId != null) return false;
        if (released != null ? !released.equals(that.released) : that.released != null) return false;
        if (tomatoesCritic != null ? !tomatoesCritic.equals(that.tomatoesCritic) : that.tomatoesCritic != null)
            return false;
        if (imdbRating != null ? !imdbRating.equals(that.imdbRating) : that.imdbRating != null) return false;
        if (runtime != null ? !runtime.equals(that.runtime) : that.runtime != null) return false;
        if (tomatoesCriticMeter != null ? !tomatoesCriticMeter.equals(that.tomatoesCriticMeter) : that.tomatoesCriticMeter != null)
            return false;
        if (imdbVotes != null ? !imdbVotes.equals(that.imdbVotes) : that.imdbVotes != null) return false;
        if (tomatoesCriticNumReviews != null ? !tomatoesCriticNumReviews.equals(that.tomatoesCriticNumReviews) : that.tomatoesCriticNumReviews != null)
            return false;
        if (tomatoesCriticRating != null ? !tomatoesCriticRating.equals(that.tomatoesCriticRating) : that.tomatoesCriticRating != null)
            return false;
        if (tomatoesDvd != null ? !tomatoesDvd.equals(that.tomatoesDvd) : that.tomatoesDvd != null) return false;
        if (tomatoesFresh != null ? !tomatoesFresh.equals(that.tomatoesFresh) : that.tomatoesFresh != null)
            return false;
        if (tomatoesLastUpdated != null ? !tomatoesLastUpdated.equals(that.tomatoesLastUpdated) : that.tomatoesLastUpdated != null)
            return false;
        if (tomatoesProduction != null ? !tomatoesProduction.equals(that.tomatoesProduction) : that.tomatoesProduction != null)
            return false;
        if (tomatoesRotten != null ? !tomatoesRotten.equals(that.tomatoesRotten) : that.tomatoesRotten != null)
            return false;
        if (tomatoesViewer != null ? !tomatoesViewer.equals(that.tomatoesViewer) : that.tomatoesViewer != null)
            return false;
        if (tomatoesViewerMeter != null ? !tomatoesViewerMeter.equals(that.tomatoesViewerMeter) : that.tomatoesViewerMeter != null)
            return false;
        if (tomatoesViewerNumReviews != null ? !tomatoesViewerNumReviews.equals(that.tomatoesViewerNumReviews) : that.tomatoesViewerNumReviews != null)
            return false;
        if (tomatoesViewerRating != null ? !tomatoesViewerRating.equals(that.tomatoesViewerRating) : that.tomatoesViewerRating != null)
            return false;
        if (tomatoesWebsite != null ? !tomatoesWebsite.equals(that.tomatoesWebsite) : that.tomatoesWebsite != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (awards != null ? awards.hashCode() : 0);
        result = 31 * result + (fullplot != null ? fullplot.hashCode() : 0);
        result = 31 * result + (numMflixComments != null ? numMflixComments.hashCode() : 0);
        result = 31 * result + (plot != null ? plot.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (awardsNominations != null ? awardsNominations.hashCode() : 0);
        result = 31 * result + (lastupdated != null ? lastupdated.hashCode() : 0);
        result = 31 * result + (poster != null ? poster.hashCode() : 0);
        result = 31 * result + (tomatoes != null ? tomatoes.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (awardsText != null ? awardsText.hashCode() : 0);
        result = 31 * result + (imdb != null ? imdb.hashCode() : 0);
        result = 31 * result + (rated != null ? rated.hashCode() : 0);
        result = 31 * result + (tomatoesConsensus != null ? tomatoesConsensus.hashCode() : 0);
        result = 31 * result + (awardsWins != null ? awardsWins.hashCode() : 0);
        result = 31 * result + (imdbId != null ? imdbId.hashCode() : 0);
        result = 31 * result + (released != null ? released.hashCode() : 0);
        result = 31 * result + (tomatoesCritic != null ? tomatoesCritic.hashCode() : 0);
        result = 31 * result + (imdbRating != null ? imdbRating.hashCode() : 0);
        result = 31 * result + (runtime != null ? runtime.hashCode() : 0);
        result = 31 * result + (tomatoesCriticMeter != null ? tomatoesCriticMeter.hashCode() : 0);
        result = 31 * result + (imdbVotes != null ? imdbVotes.hashCode() : 0);
        result = 31 * result + (tomatoesCriticNumReviews != null ? tomatoesCriticNumReviews.hashCode() : 0);
        result = 31 * result + (tomatoesCriticRating != null ? tomatoesCriticRating.hashCode() : 0);
        result = 31 * result + (tomatoesDvd != null ? tomatoesDvd.hashCode() : 0);
        result = 31 * result + (tomatoesFresh != null ? tomatoesFresh.hashCode() : 0);
        result = 31 * result + (tomatoesLastUpdated != null ? tomatoesLastUpdated.hashCode() : 0);
        result = 31 * result + (tomatoesProduction != null ? tomatoesProduction.hashCode() : 0);
        result = 31 * result + (tomatoesRotten != null ? tomatoesRotten.hashCode() : 0);
        result = 31 * result + (tomatoesViewer != null ? tomatoesViewer.hashCode() : 0);
        result = 31 * result + (tomatoesViewerMeter != null ? tomatoesViewerMeter.hashCode() : 0);
        result = 31 * result + (tomatoesViewerNumReviews != null ? tomatoesViewerNumReviews.hashCode() : 0);
        result = 31 * result + (tomatoesViewerRating != null ? tomatoesViewerRating.hashCode() : 0);
        result = 31 * result + (tomatoesWebsite != null ? tomatoesWebsite.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public Object getDirectors() {
        return directors;
    }

    public void setDirectors(Object directors) {
        this.directors = directors;
    }

    public Object getLanguages() {
        return languages;
    }

    public void setLanguages(Object languages) {
        this.languages = languages;
    }

    public Object getWriters() {
        return writers;
    }

    public void setWriters(Object writers) {
        this.writers = writers;
    }

    public Object getGenres() {
        return genres;
    }

    public void setGenres(Object genres) {
        this.genres = genres;
    }

    public Object getCast() {
        return cast;
    }

    public void setCast(Object cast) {
        this.cast = cast;
    }

    public Object getCountries() {
        return countries;
    }

    public void setCountries(Object countries) {
        this.countries = countries;
    }
}
