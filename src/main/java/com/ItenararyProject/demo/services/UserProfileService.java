package com.ItenararyProject.demo.services;

import com.ItenararyProject.demo.domain.UserProfile;

import java.util.Set;

public interface UserProfileService {
    public Set<UserProfile> findAllUsers();
    public UserProfile getUserById(Long id);
    public UserProfile saveOrUpdateUser(UserProfile userProfile);
}
