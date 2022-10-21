package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.user.User;
import com.sparta.thefightingsheep.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserWebController {

    private final UserDao userDao;

    @Autowired
    public UserWebController(UserDao userDao) {
        this.userDao = userDao;
    }

    //READ USERS
    @GetMapping("/web/user/find/all")
    public String displayUsers(Model model){
        List<UserDto> userDTOList = userDao.findAll();
        model.addAttribute("allUsers", userDTOList);
        return "Users";
    }

    @GetMapping("web/user/find/{id}")
    public String getUserById(@PathVariable String id, Model model){
        UserDto userDto = userDao.findById(id).get();
        model.addAttribute("User", userDto);
        return "User";
    }


    @PostMapping("/web/user/add")
    public String addUser(@ModelAttribute User newUser, Model model){
        UserDto userDto = new UserDto(newUser.getName(),newUser.getEmail(),newUser.getPassword(),newUser.getRole().name());
        userDao.insert(userDto);
        model.addAttribute("newUser", userDto);
        return "User";
    }

    @PostMapping("/web/user/signup")
    public String signup(@ModelAttribute UserDto user, Model model){
        String userInsert = userDao.insert(user);
        if (userInsert == null) {
            model.addAttribute("newUser", new User());
            model.addAttribute("userRegistered",false);
            return "signup";
        }
        model.addAttribute("newUser", user);
        model.addAttribute("userRegistered",true);
        return "login";
    }

//    @PostMapping("/users/newUser")
//    public String createNewUser(@ModelAttribute User user, Model model){
//        UserDto savedUser = userDAO.addNewUser(user);
//        model.addAttribute("user", savedUser);
//        return "AddUser";
//    }

    //DELETE USER
    @GetMapping("/web/user/delete/{id}")
    public String deleteById(@PathVariable String id){
        if(userDao.delete(id))
            return "Successful";
        else
            return "Unsuccessful";
    }

//    @PostMapping("/users/delete")
//    public String userDeleted(@ModelAttribute User user, Model model){
//        UserDto deletedUser = userDAO.deleteUser(user.getId());
//        model.addAttribute("user", deletedUser);
//        return "";
//    }
//
//    //UPDATE USER
    @GetMapping("/users/edit/{userDto}")
    public String editUser(@PathVariable UserDto userDto, Model model){
        userDao.update(userDto);
        UserDto user = userDao.findById(userDto.getId()).get();
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
