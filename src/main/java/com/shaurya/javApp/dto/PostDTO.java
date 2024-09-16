package com.shaurya.javApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostDTO {
    private Long postId;
    private Long communityId;  // Reference to the Community ID
    private String postTitle;
    private String postBody;
    private Long createdByWhom;  // Reference to the User ID
    private LocalDateTime timeCreated;
    private Integer votes;
    private String postImage;
}