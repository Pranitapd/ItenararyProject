package com.ItenararyProject.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String review;

    //This is a relationship between user and place
    //will have coposite key userProfile and Places
    //but a user can write more than one review about a place so we need to have special ID for this
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile userProfile;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

}
