package com.sparta.thefightingsheep.model.entity.movie;

import com.mongodb.lang.Nullable;
import lombok.Data;

import java.time.Instant;

@Data
public class Tomatoes {
    @Nullable
    private String consensus;
    @Nullable
    private Critic critic;
    @Nullable
    private Instant dvd;
    @Nullable
    private Integer fresh;
    private Instant lastUpdated;
    @Nullable
    private String production;
    @Nullable
    private Integer rotten;
    @Nullable
    private Viewer viewer;
    @Nullable
    private String website;

    public Tomatoes() {}

    public Tomatoes(Instant lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Tomatoes(@Nullable String consensus, @Nullable Critic critic, @Nullable Instant dvd, @Nullable Integer fresh, Instant lastUpdated, @Nullable String production, @Nullable Integer rotten, @Nullable Viewer viewer, @Nullable String website) {
        this.consensus = consensus;
        this.critic = critic;
        this.dvd = dvd;
        this.fresh = fresh;
        this.lastUpdated = lastUpdated;
        this.production = production;
        this.rotten = rotten;
        this.viewer = viewer;
        this.website = website;
    }
}
