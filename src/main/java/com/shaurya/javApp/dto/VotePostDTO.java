package com.shaurya.javApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class VotePostDTO {
    private Long vpId;
    private Long userId;  // Reference to the User ID
    private Long postId;  // Reference to the Post ID
}