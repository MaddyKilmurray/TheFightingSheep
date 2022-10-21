package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.entity.user.User;
import com.sparta.thefightingsheep.model.repository.UserRepository;
import com.sparta.thefightingsheep.model.dao.UserDao;
import com.sparta.thefightingsheep.model.dto.UserDto;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserApiController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserDao userDAO;


    @GetMapping("/user/find/{id}")
    public UserDto getUserById(@PathVariable String id){
        UserDto userDTO = userDAO.findById(id).get();
        return userDTO;
    }

    @GetMapping("/user/find/all")
    public List<UserDto> getAllCustomers(){
        List<UserDto> userDTOList = userDAO.findAll();
        return userDTOList;
    }

    @DeleteMapping("/user/delete/{id}")
    public Boolean deleteById(@PathVariable String id){
        return(userDAO.delete(id));
    }

    @PostMapping("/user/add")
    @ResponseBody
    public String addUser(@RequestParam UserDto userDto){
        return (userDAO.insert(userDto));
    }
    @PatchMapping("/user/{id}/name/{newname}")
    public UserDto updateName(@PathVariable String id, @PathVariable String newname){
        UserDto userDTO = new UserDto(id, newname, null, null);
        userDAO.update(userDTO);
        return userDTO;
    }

    @PatchMapping("/user/{id}/password/{newpassword}")
    public UserDto updatePassword(@PathVariable String id, @PathVariable String newpassword){
        UserDto userDTO = userDAO.findById(id).get();
        userDTO.setPassword(newpassword);
        userDAO.update(userDTO);
        return userDTO;
    }

    @PutMapping("/user/force")
    @ResponseBody
    public String forceUpdatePassword(@RequestParam UserDto userDto){;
        return (userDAO.forceUpdate(userDto));
    }

}
