package com.shaurya.javApp.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class VotePostId implements Serializable {
    private Long post;
    private Long user;
}

