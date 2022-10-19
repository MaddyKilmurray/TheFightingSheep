package com.sparta.thefightingsheep.modelm.entity.movie;

import com.mongodb.lang.Nullable;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Tomatoes {
    @Nullable
    private String consensus;
    @Nullable
    private Critic critic;
    @Nullable
    private LocalDateTime dvd;
    @Nullable
    private Integer fresh;
    private LocalDateTime lastUpdated;
    @Nullable
    private String production;
    @Nullable
    private Integer rotten;
    @Nullable
    private Viewer viewer;
    @Nullable
    private String website;

    public Tomatoes() {}

    public Tomatoes(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Tomatoes(@Nullable String consensus, @Nullable Critic critic, @Nullable LocalDateTime dvd, @Nullable Integer fresh, LocalDateTime lastUpdated, @Nullable String production, @Nullable Integer rotten, @Nullable Viewer viewer, @Nullable String website) {
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
