package com.shaurya.javApp.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "votePosts")
@IdClass(VotePostId.class)
public class VotePost {

    @Id
    @ManyToOne
    @JoinColumn(name = "postId", referencedColumnName = "postId")
    private Post post;

    @Id
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
}

