package com.ItenararyProject.demo.bootstrap;

import com.ItenararyProject.demo.domain.UserProfile;
import com.ItenararyProject.demo.repository.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.ArrayList;
import java.util.List;

public class Itenarary_bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final ActivitiesRepository activitiesRepository;
    private final AttractionsRepository attractionsRepository;
    private final InterestRepository interestRepository;
    private final PlaceRepository placeRepository;
    private final ReviewsRepository reviewsRepository;
    private final UserRepository userRepository;

    public Itenarary_bootstrap(ActivitiesRepository activitiesRepository, AttractionsRepository attractionsRepository, InterestRepository interestRepository, PlaceRepository placeRepository, ReviewsRepository reviewsRepository, UserRepository userRepository) {
        this.activitiesRepository = activitiesRepository;
        this.attractionsRepository = attractionsRepository;
        this.interestRepository = interestRepository;
        this.placeRepository = placeRepository;
        this.reviewsRepository = reviewsRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

    }
}
