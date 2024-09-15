package com.shaurya.javApp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Data
@Table(name = "communities")
public class Community {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comId;

    @Column(length = 100)
    private String comName;

    @ManyToOne
    @JoinColumn(name = "createdByWhom", referencedColumnName = "id")
    private User createdByWhom;

    private LocalDateTime timeCreated;

    @Column(columnDefinition = "TEXT")
    private String category;

    @Column(columnDefinition = "TEXT")
    private String communityProfileImage;
}
