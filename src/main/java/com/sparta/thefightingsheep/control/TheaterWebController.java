package com.sparta.thefightingsheep.control;
import com.sparta.thefightingsheep.model.dao.TheaterDao;
import com.sparta.thefightingsheep.model.dto.TheaterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping("/web/theater")
public class TheaterWebController {
    @Autowired
    private TheaterDao dao;


    @GetMapping("/{id}")
    public String getTheaterById(@PathVariable String id, Model model) {
        Optional<TheaterDto> result = dao.findById(id);
        if (result.isPresent()) {
            model.addAttribute("theater", result);
            return "";
        } else
            return "not-found";

    }

    //DELETE
    @PostMapping("/delete/{id}")
    public String deleteById(@PathVariable String id, Model model) {
        Optional<TheaterDto> theaterDto = dao.findById(id);
        if (theaterDto.isPresent()) {
            model.addAttribute("theater", theaterDto);
            dao.delete(id);
            return "";
        } else
            return "not-found";
    }

    //CREATE
    @GetMapping("/add")
    public String addNewTheaterForm(Model model) {
        TheaterDto theaterDto = new TheaterDto();
        model.addAttribute("theater", theaterDto);
        return "";
    }

    @PostMapping("/add")
    public String addNewTheater(@ModelAttribute TheaterDto theaterDto, Model model) {
        String newTheaterId = dao.insert(theaterDto);
        Optional<TheaterDto> theaterDto1 = dao.findById(newTheaterId);
        model.addAttribute("theater", theaterDto1);
        return "";
    }

    @GetMapping("/all")
    public String getAllTheatersWeb(Model model) {
        List<TheaterDto> theaterDtos = dao.findAll();
        model.addAttribute("theaters", theaterDtos);
        return "";
    }
}
