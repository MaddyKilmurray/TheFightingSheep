package com.sparta.thefightingsheep.model.dto.user;


import com.sparta.thefightingsheep.model.dto.Dto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class UserDto extends Dto {

    private String name;
    private String email;
    private String password;
    private Role role;

    public UserDto() {}

    public UserDto(String name, String email, String password, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserDto(String id, String name, String email, String password, Role role) {
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
