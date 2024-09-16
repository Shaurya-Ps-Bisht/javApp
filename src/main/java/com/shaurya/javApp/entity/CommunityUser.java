package com.shaurya.javApp.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "communityUser")
@IdClass(CommunityUserId.class)
public class CommunityUser {

    @Id
    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "comid", referencedColumnName = "comid")
    private Community community;
}

