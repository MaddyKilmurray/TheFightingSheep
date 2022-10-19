package com.sparta.thefightingsheep.model.movie;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "movies")
public class Movie {
    @Id
    private String id;
    private String plot;
    private List<String> genres;
    private Integer runtime;
    private List<String> cast;
    private Integer num_mflix_comments;
    private String title;
    private String fullplot;
    private List<String> languages;
    private Date released;
    private List<String> directors;
    private String rated;
    private Awards awards;
    private String lastupdated;
    private String year;
    private Imdb imdb;
    private List<String> countries;
    private String type;
    private Tomatoes tomatoes;
}
