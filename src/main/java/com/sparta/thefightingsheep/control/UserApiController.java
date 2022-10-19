package com.sparta.thefightingsheep.control;


import com.sparta.thefightingsheep.model.entity.user.User;
import com.sparta.thefightingsheep.model.repository.UserRepository;
import com.sparta.thefightingsheep.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserApiController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserDao userDAO;


//    @GetMapping("/user/find/{id}")
//    public UserDTO getUserById(@PathVariable String id){
//        UserDTO userDTO = new UserDTO(new ObjectId(id),null, null, null);
//        userDTO = userDAO.findById(new ObjectId(id));
//        return userDTO;
//    }

    @GetMapping("/user/all")
    public List<User> getAllCustomers(){
//        userRepo repo = userRepo.getInstance();
        System.out.println(userRepo.findAll());
        return userRepo.findAll();
    }

//    @DeleteMapping("/user/delete/{id}")
//    public ObjectId deleteById(@PathVariable ObjectId id){
//        User user = userRepo.findById(String.valueOf(id)).get();
//        userDAO.delete(id);
//        return user.getId();
//    }

//    @PatchMapping("/user/{id}/name/{newname}")
//    public UserDTO updateName(@PathVariable ObjectId id, @PathVariable String newname){
//        UserDTO userDTO = new UserDTO(id, newname, null, null);
//        userDTO = userDAO.update(userDTO);
//        return userDTO;
//    }

//    @PatchMapping("/user/{id}/password/{newpassword}")
//    public UserDTO updatePassword(@PathVariable ObjectId id, @PathVariable String newpassword){
//        UserDTO userDTO = new UserDTO(id, null, null, newpassword);
//        userDTO = userDAO.update(userDTO);
//        return userDTO;
//    }

//    @PutMapping("/user/put/{id}/name/{newName}")
//    public void edditOrAdduser(@PathVariable int id, @PathVariable String newName) {
//        User user = userRepo.findById(String.valueOf(id)).get();
//
//        product.setProductName(newProductName);
//        productRepo.save(product);
//    }

}
