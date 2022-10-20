package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dao.TheaterDao;
import com.sparta.thefightingsheep.model.dto.TheaterDto;
import com.sparta.thefightingsheep.model.entity.theater.Theater;
import com.sparta.thefightingsheep.model.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    private TheaterRepository theaterRepo;

    @Autowired
    private TheaterDao dao;

    //READ
    @GetMapping("/all")
    public List<Theater> getAllTheaters() {
        return theaterRepo.findAll();
    }

    @GetMapping("/{id}")
    public String getTheaterById(@PathVariable String id, Model model){
        Optional<TheaterDto> result = dao.findById(id);
        if (result.isPresent()) {
            model.addAttribute("theater", result);
            return "";
        } else
            return "notFound";

    }

    //DELETE
    @PostMapping("/delete/{id}")
    public String deleteById(@PathVariable String id, Model model){
        Optional<TheaterDto> theaterDto = dao.findById(id);
        if (theaterDto.isPresent()){
            model.addAttribute("theater", theaterDto);
            dao.delete(id);
            return "";
        } else
            return "notFound";
    }

    //CREATE
    @GetMapping("/add")
    public String addNewTheaterForm(Model model){
        TheaterDto theaterDto = new TheaterDto();
        model.addAttribute("theater", theaterDto);
        return "";
    }

    @PostMapping("/add")
    public String addNewTheater(@ModelAttribute TheaterDto theaterDto, Model model){
        String newTheaterId = dao.insert(theaterDto);
        Optional<TheaterDto> theaterDto1 = dao.findById(newTheaterId);
        model.addAttribute("theater", theaterDto1);
        return "";
    }



}
