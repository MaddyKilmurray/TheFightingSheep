package com.sparta.thefightingsheep.modelm.entity.movie;

import com.mongodb.lang.Nullable;
import lombok.Data;

@Data
public class Viewer {
    @Nullable
    private Integer meter;
    private Integer numReviews;
    @Nullable
    private Double rating;

    public Viewer() {}

    public Viewer(Integer numReviews) {
        this.numReviews = numReviews;
    }

    public Viewer(@Nullable Integer meter, Integer numReviews, @Nullable Double rating) {
        this.meter = meter;
        this.numReviews = numReviews;
        this.rating = rating;
    }
}
