package com.sparta.thefightingsheep.modelm.entity.movie;

import com.mongodb.lang.Nullable;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Imdb {
    @Field("id")
    private Integer id;
    @Nullable
    private Double rating;
    @Nullable
    private Integer votes;

    public Imdb() {}

    public Imdb(Integer id) {
        this.id = id;
    }

    public Imdb(Integer id, @Nullable Double rating, @Nullable Integer votes) {
        this.id = id;
        this.rating = rating;
        this.votes = votes;
    }
}
