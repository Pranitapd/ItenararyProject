package com.ItenararyProject.demo.dao;

import com.ItenararyProject.demo.domain.UserProfile;
import com.ItenararyProject.demo.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Component
public class UserProfileDaoImpl implements UserProfileDao {

    private final UserRepository userRepository;

    public UserProfileDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<UserProfile> getUserProfiles() {
        Set<UserProfile> users = new HashSet<>();
        userRepository.findAll().iterator().forEachRemaining(users::add);
        return users;
    }

    @Override
    public UserProfile getUserById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public UserProfile saveOrUpdateUser(UserProfile userProfile) {
        return userRepository.save(userProfile);
    }
}
