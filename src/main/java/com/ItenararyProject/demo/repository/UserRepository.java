package com.ItenararyProject.demo.repository;

import com.ItenararyProject.demo.domain.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserProfile, Long> {
}
