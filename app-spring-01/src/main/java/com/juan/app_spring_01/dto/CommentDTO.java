package com.juan.app_spring_01.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String comment;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {
    }

    public CommentDTO(AuthorDTO author, String comment, Date date) {
        this.author = author;
        this.comment = comment;
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
