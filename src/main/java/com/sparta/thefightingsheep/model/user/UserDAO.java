package com.sparta.thefightingsheep.model.user;

import com.sparta.thefightingsheep.model.entity.UsersEntity;
import com.sparta.thefightingsheep.model.entity.UsersEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserDAO {

    @Autowired
    private UserRepository userRepo;

    public UserDAO(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public UsersEntityDTO getUserById(String id){
        Optional<UsersEntity> foundUser = userRepo.findById(id);
        if(foundUser.isPresent())
            return convertUser(foundUser.get());
        else
            return new UsersEntityDTO(null, null, null, null);
    }

    //READ
    public List<UsersEntityDTO> getAllUsers(){
        List<UsersEntityDTO> userDTOS = new ArrayList<>();
        List<UsersEntity> users = userRepo.findAll();
        for(UsersEntity user: users){
            userDTOS.add(convertUser(user));
        }
        return userDTOS;
    }

    public UsersEntityDTO addNewUser(UsersEntity user) {
        UsersEntity savedUser = userRepo.save(user);
        if(savedUser != null)
            return convertUser(savedUser);
        else
            return new UsersEntityDTO(null, null, null, null);
    }

    public UsersEntityDTO deleteUser(String id) {
        Optional<UsersEntity> foundUser = userRepo.findById(id);
        if (foundUser.isPresent()) {
            userRepo.delete(foundUser.get());
            return convertUser(foundUser.get());
        } else
            return new UsersEntityDTO(null, null, null, null);
    }

    public UsersEntityDTO update(UsersEntity user) {
        Optional<UsersEntity> optional = userRepo.findById(user.getId().toString());
        UsersEntity theUser;
        if(optional.isPresent())
            theUser = optional.get();
        else
            return new UsersEntityDTO(null, null, null, null);

        if(user.getName() !=null)
            theUser.setName(user.getName());
        if(user.getEmail() !=null)
            theUser.setEmail(user.getEmail());
        if(user.getPassword() !=null)
            theUser.setPassword(user.getPassword());
        userRepo.save(theUser);
        theUser = userRepo.findById(user.getId()).get();
        return  new UsersEntityDTO(theUser.getId(),
                theUser.getName(), theUser.getEmail(), theUser.getPassword());
    }


    private UsersEntityDTO convertUser(UsersEntity user) {
        return new UsersEntityDTO(user.getId(), user.getName(), user.getEmail(), user.getPassword());
    }

}
