package com.sparta.thefightingsheep.modelm.entity.movie;

import com.mongodb.lang.Nullable;
import lombok.Data;

@Data
public class Critic {
    @Nullable
    private Integer meter;
    @Nullable
    private Integer numReviews;
    @Nullable
    private Double rating;

    public Critic() {}

    public Critic(@Nullable Integer meter, @Nullable Integer numReviews, @Nullable Double rating) {
        this.meter = meter;
        this.numReviews = numReviews;
        this.rating = rating;
    }
}
