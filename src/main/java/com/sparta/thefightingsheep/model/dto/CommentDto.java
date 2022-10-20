package com.sparta.thefightingsheep.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.bson.types.ObjectId;

import java.time.Instant;

@Data
@EqualsAndHashCode(callSuper=false)
public class CommentDto extends Dto {

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
    private Instant date;
    private String email;
    private String movieId;
    private String name;
    private String text;
    private Role role;

    public boolean setRole(String role) {
        try {
            this.role = Role.valueOf(role);
            return true;
        } catch (Exception e) { return false; }
    }

    public void setRoleNull() {
        role = null;
    }

    public CommentDto() {}

    public CommentDto(Instant date, String email, String movieId, String name, String text, String role) {
        this.date = date;
        this.email = email;
        this.movieId = movieId;
        this.name = name;
        this.text = text;
        setRole(role);
    }

    public CommentDto(String id, Instant date, String email, String movieId, String name, String text, String role) {
        super(id);
        this.date = date;
        this.email = email;
        this.movieId = movieId;
        this.name = name;
        this.text = text;
        setRole(role);
    }

    public CommentDto(String id, String date, String email, String movieId, String name, String text) {
    }
}
