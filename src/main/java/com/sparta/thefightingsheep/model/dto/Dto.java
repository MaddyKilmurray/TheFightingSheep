package com.sparta.thefightingsheep.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Dto implements Serializable {
    private String id;

    public Dto() {}

    public Dto(String id) {
        this.id = id;
    }
}
