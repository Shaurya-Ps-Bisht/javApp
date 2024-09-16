package com.shaurya.javApp.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CommunityDTO {
    private Long comId;
    private String comName;
    private String category;
    private String communityProfileImage;
    private LocalDateTime timeCreated;
}