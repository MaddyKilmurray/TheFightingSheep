package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.user.User;
import com.sparta.thefightingsheep.model.repository.UserRepository;
import com.sparta.thefightingsheep.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserWebController {

    @Autowired
    private UserRepository repo;
    private final UserDao userDAO;


    public UserWebController(UserDao userDAO) {
        this.userDAO = userDAO;
    }

    //READ USERS
    @GetMapping("/web/user/find/all")
    public String displayUsers(Model model){
        List<User> allUsers = repo.findAll();
        model.addAttribute("allUsers", allUsers);
        return "Users";
    }

    @GetMapping("web/user/find/{id}")
    public String getUserById(@PathVariable String id, Model model){
        UserDto userDTO = userDAO.findById(id).get();
        model.addAttribute("User", userDTO);
        return "User";
    }


    @GetMapping("/web/user/add")
    @ResponseBody
    public String addUser(@RequestParam String id, @RequestParam String name, @RequestParam String email, @RequestParam String password, Model model){
        UserDto userDTO = new UserDto(id, name, email, password, "USER");
        model.addAttribute("User", userDTO);
        return "User";
    }

//    @PostMapping("/users/newUser")
//    public String createNewUser(@ModelAttribute User user, Model model){
//        UserDto savedUser = userDAO.addNewUser(user);
//        model.addAttribute("user", savedUser);
//        return "AddUser";
//    }

    //DELETE USER
    @GetMapping("/user/delete/{id}")
    public String deleteById(@PathVariable String id){
        userDAO.delete(id);
        return "successful";
    }

//    @PostMapping("/users/delete")
//    public String userDeleted(@ModelAttribute User user, Model model){
//        UserDto deletedUser = userDAO.deleteUser(user.getId());
//        model.addAttribute("user", deletedUser);
//        return "";
//    }
//
//    //UPDATE USER
    @GetMapping("/users/edit/{id}")
    public String editUser(@PathVariable String id, Model model){
        UserDto user = userDAO.findById(id).get();
        model.addAttribute("user", user);
        return "User";
    }
//
//    @PostMapping("/users/edit")
//    public String UserEdited(@ModelAttribute User user, Model model){
//        UserDTO editedUser = userDAO.update(user);
//        model.addAttribute("user", editedUser);
//        return "";
//    }
//

}
