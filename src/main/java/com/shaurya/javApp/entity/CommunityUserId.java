package com.shaurya.javApp.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class CommunityUserId implements Serializable {
    private Long user;
    private Long community;
}
