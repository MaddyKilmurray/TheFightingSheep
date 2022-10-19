//package com.sparta.thefightingsheep.model.comments;
//
//import javax.persistence.*;
//import java.sql.Date;
//
//@Entity
//@Table(name = "comments", schema = "sample_mflix", catalog = "")
//public class CommentsEntity {
//    @Basic
//    @Id
//    @Column(name = "_id", nullable = false)
//    private String id;
//    @Basic
//    @Column(name = "date")
//    private Date date;
//    @Basic
//    @Column(name = "email")
//    private String email;
//    @Basic
//    @Column(name = "movie_id")
//    private String movieId;
//    @Basic
//    @Column(name = "name")
//    private String name;
//    @Basic
//    @Column(name = "text")
//    private String text;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(String movieId) {
//        this.movieId = movieId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        CommentsEntity that = (CommentsEntity) o;
//
//        if (id != null ? !id.equals(that.id) : that.id != null) return false;
//        if (date != null ? !date.equals(that.date) : that.date != null) return false;
//        if (email != null ? !email.equals(that.email) : that.email != null) return false;
//        if (movieId != null ? !movieId.equals(that.movieId) : that.movieId != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (text != null ? !text.equals(that.text) : that.text != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (date != null ? date.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (movieId != null ? movieId.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (text != null ? text.hashCode() : 0);
//        return result;
//    }
//}
