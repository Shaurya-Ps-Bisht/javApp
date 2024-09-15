package com.shaurya.javApp.entity;


import lombok.Data;
import java.io.Serializable;

@Data
public class VoteCommentId implements Serializable {
    private Long comment;
    private Long user;
}

