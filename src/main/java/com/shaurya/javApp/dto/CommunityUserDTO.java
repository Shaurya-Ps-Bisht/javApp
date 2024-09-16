package com.shaurya.javApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommunityUserDTO {
    private Long comuId;
    private Long userId;
    private Long comId;
    private LocalDateTime joinedOn;
    private String role;
}