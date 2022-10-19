package com.sparta.thefightingsheep.control;


import com.sparta.thefightingsheep.model.user.User;
import com.sparta.thefightingsheep.model.user.UserDAO;
import com.sparta.thefightingsheep.model.user.UserDTO;
import com.sparta.thefightingsheep.model.user.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserApiController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserDAO userDAO;


    @GetMapping("/user/find/{id}")
    public UserDTO getUserById(@PathVariable ObjectId id){
        UserDTO userDTO = userDAO.findById(id);
        return userDTO;
    }

    @GetMapping("/user/find/all")
    public List<UserDTO> getAllCustomers(){
        List<UserDTO> userDTOList = userDAO.findAll();
        return userDTOList;
    }

    @DeleteMapping("/user/delete/{id}")
    public ObjectId deleteById(@PathVariable ObjectId id){
        User user = userRepo.findById(String.valueOf(id)).get();
        userDAO.delete(id);
        return user.getId();
    }

    @PostMapping("/user/add/{id}/{name}/{email}/{password}")
    public UserDTO addUser(@PathVariable ObjectId id, @PathVariable String name, @PathVariable String email, @PathVariable String password){
        UserDTO userDTO = userDAO.addUser(id, name, email, password);
        return userDTO;
    }
    @PatchMapping("/user/{id}/name/{newname}")
    public UserDTO updateName(@PathVariable ObjectId id, @PathVariable String newname){
        UserDTO userDTO = new UserDTO(id, newname, null, null);
        userDTO = userDAO.update(userDTO);
        return userDTO;
    }

    @PatchMapping("/user/{id}/password/{newpassword}")
    public UserDTO updatePassword(@PathVariable ObjectId id, @PathVariable String newpassword){
        UserDTO userDTO = new UserDTO(id, null, null, newpassword);
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
