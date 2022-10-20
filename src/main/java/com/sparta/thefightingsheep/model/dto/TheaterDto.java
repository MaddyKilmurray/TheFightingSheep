package com.sparta.thefightingsheep.model.dto;


import com.sparta.thefightingsheep.model.entity.theater.Location;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class TheaterDto extends Dto {
    private Integer theaterId;
    private Location location;

    public TheaterDto() {}

    public TheaterDto(Integer theaterId, Location location) {
        this.theaterId = theaterId;
        this.location = location;
    }

    public TheaterDto(String id, Integer theaterId, Location location) {
        super(id);
        this.theaterId = theaterId;
        this.location = location;
    }
}
