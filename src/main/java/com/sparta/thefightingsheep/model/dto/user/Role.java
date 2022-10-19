package com.sparta.thefightingsheep.model.dto.user;

import lombok.Getter;

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
