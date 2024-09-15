package com.shaurya.javApp.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @ManyToOne
    @JoinColumn(name = "comId", referencedColumnName = "comId")
    private Community community;

    @Column(length = 100)
    private String postTitle;

    @Column(columnDefinition = "TEXT")
    private String postBody;

    @ManyToOne
    @JoinColumn(name = "createdByWhom", referencedColumnName = "id")
    private User createdByWhom;

    private LocalDateTime timeCreated;

    private Integer votes;

    @Column(columnDefinition = "TEXT")
    private String postImage;
}
