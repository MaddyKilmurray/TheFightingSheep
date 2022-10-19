package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.user.User;
import com.sparta.thefightingsheep.model.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserDao {

    private final UserRepository repository;

    @Autowired
    public UserDao(UserRepository repository) {
        this.repository = repository;
    }

    public UserDto update(UserDto userDTO){
        Optional<User> optional = repository.findById(new ObjectId(userDTO.getId()));
        User user = null;
        if(optional.isPresent())
            user = optional.get();
        else
            return new UserDto(null, null, null, null);
        if(userDTO.getName()!= null)
            user.setName(userDTO.getName());
        repository.save(user);
        user = repository.findById(new ObjectId(userDTO.getId())).get();
        return new UserDto(user.getId().toHexString(), user.getName(), user.getEmail(), user.getPassword());
    }



    public UserDto findById(String id){
        Optional<User> optional = repository.findById(new ObjectId(id));
        User user = null;
        if(!optional.isPresent())
            return new UserDto(null, null, null, null);
        else {
            user = optional.get();
            // UserDTO result = new UserDTO(id,null,null,null);
            // user = userRepo.findById(id).get();
            UserDto result = new UserDto(user.getId().toHexString(), user.getName(), user.getEmail(), user.getPassword());
            return result;
        }
    }

    public List<UserDto> findAll(){
        List<UserDto> userDTOList = new ArrayList<>();
        List<User> userList = repository.findAll();
        userList.forEach(p->userDTOList.add(new UserDto(p.getId().toHexString(), (p.getName()), (p.getEmail()), (p.getPassword()))));
        return userDTOList;
    }

    public void delete(String id){
        repository.deleteById(new ObjectId(id));
    }

    public UserDto addUser(String id, String name, String email, String password){
        User user = null;
        UserDto newUser = new UserDto(id,name,email,password);
        user.setId(new ObjectId(newUser.getId()));
        user.setName(newUser.getName());
        user.setEmail(newUser.getEmail());
        user.setPassword(newUser.getPassword());
        repository.save(user);
        return newUser;
    }
}
