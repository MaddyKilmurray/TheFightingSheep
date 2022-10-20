package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dao.TheaterDao;
import com.sparta.thefightingsheep.model.dto.TheaterDto;
import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.theater.Address;
import com.sparta.thefightingsheep.model.entity.theater.Geo;
import com.sparta.thefightingsheep.model.entity.theater.Location;
import com.sparta.thefightingsheep.model.entity.theater.Theater;
import com.sparta.thefightingsheep.model.repository.TheaterRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    private TheaterRepository theaterRepo;

    @Autowired
    private TheaterDao theaterDAO;

    @GetMapping("/find/all")
    public List<TheaterDto> getAllTheaters() {
        List<TheaterDto> theaterListDto = theaterDAO.findAll();
        return theaterListDto;
    }

    @GetMapping("/find/{id}")
    public Theater getTheaterById(@PathVariable String id) {
        Theater theater = theaterRepo.findById(new ObjectId(id).get()).get();
        return theater;
    }

    @DeleteMapping("/delete/{id}")
    public ObjectId deleteById(@PathVariable String id){
        Theater theater = theaterRepo.findById(new ObjectId(id)).get();
        theaterRepo.delete(theater);
        return theater.getId();
    }

    @PostMapping("/add/{id}/{theaterId}/{street1}/{city}/{state}/{zipcode}/{coord1}/{coord2}")
    public String addTheater(@PathVariable String id,
                             @PathVariable int theaterId,
                             @PathVariable String street1,
                             @PathVariable String city,
                             @PathVariable String state,
                             @PathVariable String zipcode,
                             @PathVariable Double coord1,
                             @PathVariable Double coord2){
        List<Double> coordinates = new ArrayList<>();
        coordinates.add(coord1); coordinates.add(coord2);
        Geo geo = new Geo(coordinates);
        Address address = new Address(street1, city, state, zipcode);
        TheaterDto theaterDto = new TheaterDto(id, theaterId, new Location(address, geo));
        theaterDAO.insert(theaterDto);
        return theaterDAO.insert(theaterDto);
    }

    @PostMapping("/add/{id}/{theaterId}/{street1}/{city}/{state}/{zipcode}")   //adding a theater without
    public String addTheater(@PathVariable String id,
                             @PathVariable int theaterId,
                             @PathVariable String street1,
                             @PathVariable String city,
                             @PathVariable String state,
                             @PathVariable String zipcode){
        Geo geo = new Geo();
        Address address = new Address(street1, city, state, zipcode);
        TheaterDto theaterDto = new TheaterDto(id, theaterId, new Location(address, geo));
        theaterDAO.insert(theaterDto);
        return theaterDAO.insert(theaterDto);
    }

    @PatchMapping("/{id}/theaterId/{newTheaterId}")
    public TheaterDto updateTheater(@PathVariable String id, @PathVariable Integer newTheaterId){
        Theater theater = theaterRepo.findById(new ObjectId(id).get()).get();
        TheaterDto theaterDto = new TheaterDto(id, newTheaterId, theater.getLocation());
        theaterDAO.update(theaterDto);
        return theaterDto;
    }

}
