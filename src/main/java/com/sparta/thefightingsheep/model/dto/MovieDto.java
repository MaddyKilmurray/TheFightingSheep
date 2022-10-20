package com.sparta.thefightingsheep.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class MovieDto extends Dto {

    @Data
    public class Awards {
        private Integer wins;
        private Integer nominations;
        private String text;
        private Awards(Integer wins, Integer nominations, String text) {
            this.wins = wins;
            this.nominations = nominations;
            this.text = text;
        }
    }

    @Data
    public class Imdb {
        private Integer id;
        private Double rating;
        private Integer votes;

        private Imdb(Integer id, Double rating, Integer votes) {
            this.id = id;
            this.rating = rating;
            this.votes = votes;
        }
    }

    public enum Rating {
        AO,
        APPROVED,
        G,
        GP,
        M,
        NC_17,
        NOT_RATED,
        OPEN,
        PASSED,
        PG,
        PG_13,
        R,
        TV_14,
        TV_G,
        TV_MA,
        TV_PG,
        TV_Y7,
        UNRATED,
        X
    }

    @Data
    public class Tomatoes {

        @Data
        public class Critic {
            private Integer meter;
            private Integer numReviews;
            private Double rating;

            private Critic(Integer meter, Integer numReviews, Double rating) {
                this.meter = meter;
                this.numReviews = numReviews;
                this.rating = rating;
            }
        }

        @Data
        public class Viewer {
            private Integer meter;
            private Integer numReviews;
            private Double rating;

            public Viewer(Integer meter, Integer numReviews, Double rating) {
                this.meter = meter;
                this.numReviews = numReviews;
                this.rating = rating;
            }
        }

        private String consensus;
        private Critic critic;
        private Instant dvd;
        private Integer fresh;
        private Instant lastUpdated;
        private String production;
        private Integer rotten;
        private Viewer viewer;
        private String website;

        /**
         * Sets the Tomatoes critic.
         * @param meter the meter
         * @param numReviews the number of reviews
         * @param rating the rating
         */
        public void setCritic(Integer meter, Integer numReviews, Double rating) {
            this.critic = new Critic(meter, numReviews, rating);
        }

        /**
         * Sets the Tomatoes critic to null.
         */
        public void setCriticNull() {
            critic = null;
        }

        /**
         * Sets the Tomatoes viewer.
         * @param meter the meter
         * @param numReviews the number of reviews
         * @param rating the rating
         */
        public void setViewer(Integer meter, Integer numReviews, Double rating) {
            this.viewer = new Viewer(meter, numReviews, rating);
        }

        /**
         * Sets the Tomatoes viewer to null.
         */
        public void setViewerNull() {
            viewer = null;
        }

        public Tomatoes(
                String consensus,
                Integer criticMeter, Integer criticNumReviews, Double criticRating,
                Instant dvd,
                Integer fresh,
                Instant lastUpdated,
                String production,
                Integer rotten,
                Integer viewerMeter, Integer viewerNumReviews, Double viewerRating,
                String website)
        {
            this.consensus = consensus;
            setCritic(criticMeter, criticNumReviews, criticRating);
            this.dvd = dvd;
            this.fresh = fresh;
            this.lastUpdated = lastUpdated;
            this.production = production;
            this.rotten = rotten;
            setViewer(viewerMeter, viewerNumReviews, viewerRating);
            this.website = website;
        }
    }

    private Awards awards;
    private List<String> cast;
    private List<String> countries;
    private List<String> directors;
    private String fullPlot;
    private List<String> genres;
    private Imdb imdb;
    private Instant lastUpdated;
    private Integer numMflixComments;
    private String plot;
    private Rating rating;
    private Integer runtime;
    private String title;
    private Tomatoes tomatoes;
    private String type;
    private Integer year;
    private List<String> languages;
    private String poster;
    private List<String> writers;

    /**
     * Sets the awards of the movie.
     * @param wins the number of wins
     * @param nominations the number of nominations
     * @param text the nomination text
     */
    public void setAwards(Integer wins, Integer nominations, String text) {
        this.awards = new Awards(wins, nominations, text);
    }

    /**
     * Sets the awards of the movie to null.
     */
    public void setAwardsNull() {
        awards = null;
    }

    /**
     * Sets the IMDB info of the movie.
     * @param id IMDB id
     * @param rating rating on IMDB
     * @param votes number of votes
     */
    public void setImdb(Integer id, Double rating, Integer votes) {
        this.imdb = new Imdb(id, rating, votes);
    }

    /**
     * Sets the IMDB info of the movie to null.
     */
    public void setImdbNull() {
        imdb = null;
    }

    /**
     * Sets the rating of the movie.
     * @param rating the rating
     * @return {@code true} if rating set successfully<br>
     * {@code false} if not
     */
    public boolean setRating(String rating) {
        try {
            this.rating = Rating.valueOf(rating);
            return true;
        } catch (Exception e) { return false; }
    }

    /**
     * Sets the rating of the movie to null.
     */
    public void setRoleNull() {
        rating = null;
    }

    /**
     * Sets the Tomatoes info of the movie.
     */
    public void setTomatoes(
            String consensus,
            Integer criticMeter, Integer criticNumReviews, Double criticRating,
            Instant dvd,
            Integer fresh,
            Instant lastUpdated,
            String production,
            Integer rotten,
            Integer viewerMeter, Integer viewerNumReviews, Double viewerRating,
            String website
    ) {
        this.tomatoes = new Tomatoes(consensus, criticMeter, criticNumReviews, criticRating, dvd, fresh, lastUpdated, production, rotten, viewerMeter, viewerNumReviews, viewerRating, website);
    }

    /**
     * Sets the Tomatoes info of the movie to null.
     */
    public void setTomatoesNull() {
        tomatoes = null;
    }

    public MovieDto(
            Integer wins, Integer nominations, String text,
            List<String> cast,
            List<String> countries,
            List<String> directors,
            String fullPlot,
            List<String> genres,
            Integer imdbId, Double imdbRating, Integer imdbVotes,
            Instant lastUpdated,
            Integer numMflixComments,
            String plot,
            String rating,
            Integer runtime,
            String title,
            String consensus,
            Integer criticMeter, Integer criticNumReviews, Double criticRating,
            Instant dvd,
            Integer fresh,
            Instant lastUpdatedTomatoes,
            String production,
            Integer rotten,
            Integer viewerMeter, Integer viewerNumReviews, Double viewerRating,
            String website,
            String type,
            Integer year,
            List<String> languages,
            String poster,
            List<String> writers
    ) {
        setAwards(wins, nominations, text);
        this.cast = cast;
        this.countries = countries;
        this.directors = directors;
        this.fullPlot = fullPlot;
        this.genres = genres;
        setImdb(imdbId, imdbRating, imdbVotes);
        this.lastUpdated = lastUpdated;
        this.numMflixComments = numMflixComments;
        this.plot = plot;
        setRating(rating);
        this.runtime = runtime;
        this.title = title;
        setTomatoes(consensus, criticMeter, criticNumReviews, criticRating, dvd, fresh, lastUpdatedTomatoes, production, rotten, viewerMeter, viewerNumReviews, viewerRating, website);
        this.type = type;
        this.year = year;
        this.languages = languages;
        this.poster = poster;
        this.writers = writers;
    }

    public MovieDto(
            String id,
            Integer wins, Integer nominations, String text,
            List<String> cast,
            List<String> countries,
            List<String> directors,
            String fullPlot,
            List<String> genres,
            Integer imdbId, Double imdbRating, Integer imdbVotes,
            Instant lastUpdated,
            Integer numMflixComments,
            String plot,
            String rating,
            Integer runtime,
            String title,
            String consensus,
            Integer criticMeter, Integer criticNumReviews, Double criticRating,
            Instant dvd,
            Integer fresh,
            Instant lastUpdatedTomatoes,
            String production,
            Integer rotten,
            Integer viewerMeter, Integer viewerNumReviews, Double viewerRating,
            String website,
            String type,
            Integer year,
            List<String> languages,
            String poster,
            List<String> writers
    ) {
        super(id);
        setAwards(wins, nominations, text);
        this.cast = cast;
        this.countries = countries;
        this.directors = directors;
        this.fullPlot = fullPlot;
        this.genres = genres;
        setImdb(imdbId, imdbRating, imdbVotes);
        this.lastUpdated = lastUpdated;
        this.numMflixComments = numMflixComments;
        this.plot = plot;
        setRating(rating);
        this.runtime = runtime;
        this.title = title;
        setTomatoes(consensus, criticMeter, criticNumReviews, criticRating, dvd, fresh, lastUpdatedTomatoes, production, rotten, viewerMeter, viewerNumReviews, viewerRating, website);
        this.type = type;
        this.year = year;
        this.languages = languages;
        this.poster = poster;
        this.writers = writers;
    }
}