package com.shaurya.javApp.repo;

import com.shaurya.javApp.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommunityRepository extends JpaRepository <Community, Long>{
    @Query("SELECT c FROM Community c WHERE c.createdByWhom.email = :email")
    List<Community> findByUserEmail(@Param("email") String email);
}
