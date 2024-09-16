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
    @Column(name = "comid")
    private Long comId;

    @Column(name = "comname", length = 100)
    private String comName;

    @ManyToOne
    @JoinColumn(name = "createdbywhom", referencedColumnName = "id", nullable = false)
    private User createdByWhom;

    @Column(name = "timecreated")
    private LocalDateTime timeCreated;

    @Column(columnDefinition = "TEXT")
    private String category;

    @Column(name = "communityprofileimage", columnDefinition = "TEXT")
    private String communityProfileImage;
}
