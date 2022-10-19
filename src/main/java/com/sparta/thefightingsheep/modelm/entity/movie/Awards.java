package com.sparta.thefightingsheep.modelm.entity.movie;

import lombok.Data;

@Data
public class Awards {
    private Integer wins;
    private Integer nominations;
    private String text;

    public Awards() {}

    public Awards(Integer wins, Integer nominations, String text) {
        this.wins = wins;
        this.nominations = nominations;
        this.text = text;
    }
}
