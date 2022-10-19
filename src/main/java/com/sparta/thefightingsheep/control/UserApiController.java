package com.sparta.thefightingsheep.control;


import com.sparta.thefightingsheep.model.entity.user.User;
import com.sparta.thefightingsheep.model.repository.UserRepository;
import com.sparta.thefightingsheep.model.dao.UserDao;
import com.sparta.thefightingsheep.model.dto.user.UserDto;
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
        UserDto userDTO = userDAO.findById(id);
        return userDTO;
    }

    @GetMapping("/user/find/all")
    public List<UserDto> getAllCustomers(){
        List<UserDto> userDTOList = userDAO.findAll();
        return userDTOList;
    }

    @DeleteMapping("/user/delete/{id}")
    public ObjectId deleteById(@PathVariable String id){
        User user = userRepo.findById(new ObjectId(id)).get();
        userDAO.delete(id);
        return user.getId();
    }

    @PostMapping("/user/add/{id}/{name}/{email}/{password}")
    public UserDto addUser(@PathVariable String id, @PathVariable String name, @PathVariable String email, @PathVariable String password){
        UserDto userDTO = userDAO.addUser(id, name, email, password);
        return userDTO;
    }
    @PatchMapping("/user/{id}/name/{newname}")
    public UserDto updateName(@PathVariable String id, @PathVariable String newname){
        UserDto userDTO = new UserDto(id, newname, null, null);
        userDTO = userDAO.update(userDTO);
        return userDTO;
    }

    @PatchMapping("/user/{id}/password/{newpassword}")
    public UserDto updatePassword(@PathVariable String id, @PathVariable String newpassword){
        UserDto userDTO = new UserDto(id, null, null, newpassword);
        userDTO = userDAO.update(userDTO);
        return userDTO;
    }

//    @PutMapping("/user/put/{id}/name/{newName}")
//    public void edditOrAdduser(@PathVariable String id, @PathVariable String newName) {
//        User user = userRepo.findById(id).get();
//
//        product.setProductName(newProductName);
//        productRepo.save(product);
//    }

}
