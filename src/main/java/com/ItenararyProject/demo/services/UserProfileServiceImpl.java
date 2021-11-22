package com.ItenararyProject.demo.services;

import com.ItenararyProject.demo.dao.UserProfileDao;
import com.ItenararyProject.demo.domain.UserProfile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileDao userProfileDao;

    public UserProfileServiceImpl(UserProfileDao userProfileDao) {
        this.userProfileDao = userProfileDao;
    }

    @Override
    public Set<UserProfile> findAllUsers() {
        return userProfileDao.getUserProfiles();
    }

    @Override
    public UserProfile getUserById(Long id) {
        return userProfileDao.getUserById(id);
    }

    @Override
    public UserProfile saveOrUpdateUser(UserProfile userProfile) {
        return userProfileDao.saveOrUpdateUser(userProfile);
    }
}
