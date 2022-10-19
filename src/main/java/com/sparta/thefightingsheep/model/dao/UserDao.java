package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.entity.user.User;
import com.sparta.thefightingsheep.model.repository.UserRepository;
import com.sparta.thefightingsheep.model.dto.UserDto;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserDao {

    @Autowired
    private UserRepository userRepo;

    public UserDao(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public UserDto update(UserDto userDTO){
        Optional<User> optional = userRepo.findById(new ObjectId(userDTO.getId()));
        User user;
        if(optional.isPresent())
            user = optional.get();
        else
            return new UserDto(null, null, null, null);
        if(userDTO.getName()!= null)
            user.setName(userDTO.getName());
        userRepo.save(user);
        user = userRepo.findById(new ObjectId(userDTO.getId())).get();
        return new UserDto(user.getId().toHexString(), user.getName(), user.getEmail(), user.getPassword());
    }



    public UserDto findById(ObjectId id){
        UserDto userDTO = new UserDto(null,null,null,null);
        User user = userRepo.findById(new ObjectId(userDTO.getId())).get();
        UserDto result = new UserDto(user.getId().toHexString(), user.getName(), user.getEmail(), user.getPassword());
        return result;
    }

    public List<UserDto> findAll(){
        List<UserDto> userDTOList = new ArrayList<>();
        List<User> userList = userRepo.findAll();
        userList.forEach(p->userDTOList.add(new UserDto(p.getId().toHexString(), (p.getName()), (p.getEmail()), (p.getPassword()))));
        return userDTOList;
    }

    public void delete(ObjectId id){
        userRepo.deleteById(id);
    }
}
