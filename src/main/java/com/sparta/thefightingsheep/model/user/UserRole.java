package com.sparta.thefightingsheep.model.user;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    USER("USER"),
    ADMIN("ADMIN");

    private String name;

    UserRole(String name) {
        this.name = name;
    }

    public UserRole getRole(String role) {
        if (role.equalsIgnoreCase("USER")) {
            return USER;
        }
        if (role.equalsIgnoreCase("ADMIN")) {
            return ADMIN;
        }
        return null;
    }

    @Override
    public String getAuthority() {
        if (this.equals(USER)) {
            return USER.name;
        }
        if (this.equals(ADMIN)) {
            return ADMIN.name;
        }
        return null;
    }
}
