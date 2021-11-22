package com.ItenararyProject.demo.dao;

import com.ItenararyProject.demo.domain.UserProfile;
import org.apache.catalina.User;

import java.util.Set;

public interface UserProfileDao {
    Set<UserProfile> getUserProfiles();
    public UserProfile getUserById(Long id);
    public UserProfile saveOrUpdateUser(UserProfile userProfile);
}
