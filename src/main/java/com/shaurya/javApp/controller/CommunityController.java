package com.shaurya.javApp.controller;

import com.shaurya.javApp.dto.CommunityDTO;
import com.shaurya.javApp.entity.Community;
import com.shaurya.javApp.service.impl.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/community")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @GetMapping("/fetchCommunities")
    public List<CommunityDTO> fetchCommunities(@RequestParam String userEmail) {
        List<Community> communities = communityService.getCommunitiesByUserEmail(userEmail);
        return communities.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private CommunityDTO convertToDTO(Community community) {
        CommunityDTO communityDTO = new CommunityDTO();
        communityDTO.setComId(community.getComId());
        communityDTO.setComName(community.getComName());
        communityDTO.setCategory(community.getCategory());
        communityDTO.setCommunityProfileImage(community.getCommunityProfileImage());
        communityDTO.setTimeCreated(community.getTimeCreated());
        return communityDTO;
    }
}