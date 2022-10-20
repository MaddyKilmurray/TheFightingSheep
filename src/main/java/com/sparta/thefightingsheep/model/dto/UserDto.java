package com.sparta.thefightingsheep.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Data
@EqualsAndHashCode(callSuper=false)
public class UserDto extends Dto {

    public enum Role {
        USER("User"),
        ADMIN("Admin");

        @Getter
        private final String type;

        Role(String role) {
            this.type = role;
        }

        @Override
        public String toString() {
            return type;
        }
    }

    private String name;
    private String email;
    private String password;
    private Role role;

    /**
     * Sets the role of the user.
     * @param role the role
     * @return {@code true} if role set successfully<br>
     * {@code false} if not
     */
    public boolean setRole(String role) {
        try {
            this.role = Role.valueOf(role);
            return true;
        } catch (Exception e) { return false; }
    }

    /**
     * Sets the role of the user to null.
     */
    public void setRoleNull() {
        role = null;
    }

    public UserDto() {}

    public UserDto(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        setRole(role);
    }

    public UserDto(String id, String name, String email, String password, String role) {
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
        setRole(role);
    }
}
