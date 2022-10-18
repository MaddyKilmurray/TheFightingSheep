package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.entity.UsersEntity;
import com.sparta.thefightingsheep.model.entity.UsersEntityDTO;
import com.sparta.thefightingsheep.model.user.UserDAO;
import com.sparta.thefightingsheep.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private UserRepository repo;
    private final UserDAO userDAO;

    public WebController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @GetMapping("/users")
    public String displayAllUsers(Model model){
        List<UsersEntityDTO> allUsers = userDAO.getAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "displayUsers";
    }
}
