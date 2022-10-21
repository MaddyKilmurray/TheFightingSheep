package com.sparta.thefightingsheep.control;
import com.sparta.thefightingsheep.model.dao.TheaterDao;
import com.sparta.thefightingsheep.model.dto.TheaterDto;
import com.sparta.thefightingsheep.model.entity.theater.Theater;
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

    @GetMapping("/")
    public String theaterMainPage(Model model) {
        return "theaterMain";
    }

    @GetMapping("/{id}")
    public String getTheaterById(@PathVariable String id, Model model) {
        Optional<TheaterDto> result = dao.findById(id);
        if (result.isPresent()) {
            model.addAttribute("theater", result.get());
            return "displayTheater";
        } else
            return "notFound";

    }

    @GetMapping("/?id={id}")
    public String getTheaterByIdId(@PathVariable String id, Model model) {
        Optional<TheaterDto> result = dao.findById(id);
        if (result.isPresent()) {
            model.addAttribute("theater", result.get());
            return "displayTheater";
        } else
            return "not-found";

    }

    //DELETE
    @PostMapping("/delete")
    public String deleteById(@ModelAttribute TheaterDto theater, Model model) {
        Optional<TheaterDto> theaterDto = dao.findById(theater.getId());
        if (theaterDto.isPresent()) {
            model.addAttribute("theater", theaterDto.get());
            dao.delete(theater.getId());
            return "theaterDeleted";
        } else
            return "not-found";
    }

    //CREATE
    @GetMapping("/add")
    public String addNewTheaterForm(Model model) {
        TheaterDto theaterDto = new TheaterDto();
        model.addAttribute("theater", theaterDto);
        return "AddTheater";
    }

    @PostMapping("/add")
    public String addNewTheater(@ModelAttribute TheaterDto theaterDto, Model model) {
        String newTheaterId = dao.insert(theaterDto);
        Optional<TheaterDto> theaterDto1 = dao.findById(newTheaterId);
        model.addAttribute("theater", theaterDto1.get());
        return "theaterAdded";
    }

    @GetMapping("/all")
    public String getAllTheatersWeb(Model model) {
        List<TheaterDto> theaterDtos = dao.findAll();
        model.addAttribute("theaters", theaterDtos);
        return "";
    }
}
