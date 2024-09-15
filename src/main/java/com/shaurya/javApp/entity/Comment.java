package com.shaurya.javApp.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @ManyToOne
    @JoinColumn(name = "createdByWhom", referencedColumnName = "id")
    private User createdByWhom;

    private Long parentComment;

    @Column(length = 255)
    private String writtenText;

    private LocalDateTime timeCreated;

    private Integer votes;

    @ManyToOne
    @JoinColumn(name = "postId", referencedColumnName = "postId")
    private Post post;
}

