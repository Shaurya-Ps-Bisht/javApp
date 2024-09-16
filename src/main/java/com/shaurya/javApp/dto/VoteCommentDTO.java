package com.shaurya.javApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class VoteCommentDTO {
    private Long vcId;
    private Long userId;  // Reference to the User ID
    private Long comtId;  // Reference to the Comment ID
}