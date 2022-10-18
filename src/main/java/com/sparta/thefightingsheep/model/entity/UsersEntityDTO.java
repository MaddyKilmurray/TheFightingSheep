package com.sparta.thefightingsheep.model.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link UsersEntity} entity
 */
public class UsersEntityDTO implements Serializable {
    private final String id;
    private final String email;
    private final String name;
    private final String password;

    public UsersEntityDTO(String id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntityDTO entity = (UsersEntityDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.password, entity.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, name, password);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "email = " + email + ", " +
                "name = " + name + ", " +
                "password = " + password + ")";
    }
}