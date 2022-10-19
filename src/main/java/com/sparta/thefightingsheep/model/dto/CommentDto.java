package com.sparta.thefightingsheep.model.dto;

import org.bson.types.ObjectId;

import java.time.Instant;

public class CommentDto {

    private ObjectId id;

    private Instant date;

    private String email;

    private ObjectId movie_id;

    private String name;

    private String text;

    public CommentDto() {
    }

    public CommentDto(ObjectId id, Instant date, String email, ObjectId movie_id, String name, String text) {
        this.id = id;
        this.date = date;
        this.email = email;
        this.movie_id = movie_id;
        this.name = name;
        this.text = text;
    }

    public ObjectId getId() { return id;
    }

    public void setId(ObjectId id) { this.id = id;
    }

    public Instant getDate() { return date;
    }

    public void setDate(Instant date) { this.date = date;
    }

    public String getEmail() { return email;
    }

    public void setEmail(String email) { this.email = email;
    }

    public ObjectId getMovie_id() { return movie_id;
    }

    public void setMovie_id(ObjectId movie_id) { this.movie_id = movie_id;
    }

    public String getName() { return name;
    }

    public void setName(String name) { this.name = name;
    }

    public String getText() { return text;
    }

    public void setText(String text) { this.text = text;
    }


}
