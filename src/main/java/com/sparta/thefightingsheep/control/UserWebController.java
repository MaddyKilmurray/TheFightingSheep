package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.user.User;
import com.sparta.thefightingsheep.model.user.UserDAO;
import com.sparta.thefightingsheep.model.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserWebController {

    @Autowired
    private UserRepository repo;
    private final UserDAO userDAO;


    public UserWebController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    //READ USERS
    @GetMapping("/users")
    public String displayUsers(Model model){
        List<User> allUsers = repo.findAll();
        model.addAttribute("allUsers", allUsers);
        return "Users";
    }
//
//    @GetMapping("/users/id/{id}")
//    public String displayById(@PathVariable String id, Model model) {
//        Optional<User> Users = repo.findById(id);
//        model.addAttribute("allUsers", Users);
//        return "Users";
//    }
//
//    //CREATE USER
//    @GetMapping("/users/newUser")
//    public String newUserForm(Model model) {
//        User user = new User();
//        model.addAttribute("user", user);
//        return "";
//    }
//
//    @PostMapping("/users/newUser")
//    public String createNewUser(@ModelAttribute User user, Model model){
//        UserDTO savedUser = userDAO.addNewUser(user);
//        model.addAttribute("user", savedUser);
//        return "";
//    }
//
//    //DELETE USER
//    @GetMapping("/users/deleteUser/{id}")
//    public String deleteUser(@PathVariable String id, Model model){
//        UserDTO user = userDAO.getUserById(id);
//        model.addAttribute("user", user);
//        return "";
//    }
//
//    @PostMapping("/users/delete")
//    public String userDeleted(@ModelAttribute User user, Model model){
//        UserDTO deletedUser = userDAO.deleteUser(user.getId());
//        model.addAttribute("user", deletedUser);
//        return "";
//    }
//
//    //UPDATE USER
//    @GetMapping("/users/edit/{id}")
//    public String editUser(@PathVariable String id, Model model){
//        UserDTO user = userDAO.getUserById(id);
//        model.addAttribute("user", user);
//        return "";
//    }
//
//    @PostMapping("/users/edit")
//    public String UserEdited(@ModelAttribute User user, Model model){
//        UserDTO editedUser = userDAO.update(user);
//        model.addAttribute("user", editedUser);
//        return "";
//    }
//



    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/accessdenied")
    public String accessDenied(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

}
