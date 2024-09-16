package com.shaurya.javApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentDTO {
    private Long comtId;
    private Long userId;  // Reference to the User ID
    private Long postId;  // Reference to the Post ID
    private String comment;
    private LocalDateTime timeCreated;
    private Integer votes;
}