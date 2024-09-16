package com.shaurya.javApp.service.impl;

import com.shaurya.javApp.entity.Community;
import com.shaurya.javApp.repo.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityService {

    @Autowired
    private CommunityRepository communityRepository;

    public List<Community> getCommunitiesByUserEmail(String email) {
        return communityRepository.findByUserEmail(email);
    }
}