package com.sparta.thefightingsheep.model.user;

import com.sparta.thefightingsheep.model.user.repository.UserRepository;
import org.bson.types.ObjectId;
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

    public UserDTO update(UserDTO userDTO){
        Optional<User> optional = userRepo.findById(String.valueOf(userDTO.getId()));
        User user = null;
        if(optional.isPresent())
            user = optional.get();
        else
            return new UserDTO(null, null, null, null);
        if(userDTO.getName()!= null)
            user.setName(userDTO.getName());
        userRepo.save(user);
        user = userRepo.findById(String.valueOf(userDTO.getId())).get();
        return new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getPassword());
    }



    public UserDTO findById(ObjectId id){
        UserDTO userDTO = new UserDTO(null,null,null,null);
        User user = userRepo.findById(String.valueOf(userDTO.getId())).get();
        UserDTO result = new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getPassword());
        return result;
    }

    public List<UserDTO> findAll(){
        List<UserDTO> userDTOList = new ArrayList<>();
        List<User> userList = userRepo.findAll();
        userList.forEach(p->userDTOList.add(new UserDTO(p.getId(), (p.getName()), (p.getEmail()), (p.getPassword()))));
        return userDTOList;
    }

    public void delete(ObjectId id){
        userRepo.deleteById(String.valueOf(id));
    }
}
