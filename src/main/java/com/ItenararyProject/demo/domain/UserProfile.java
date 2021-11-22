package com.ItenararyProject.demo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String password;
    private String name;
    private String emailId;
    private int phoneNumber;

    @ManyToMany(mappedBy = "userProfiles")
    Set<Interests> interests;

    @OneToMany(mappedBy = "userProfile")   //inverse side
    Set<Reviews> reviews;

    @OneToMany(mappedBy = "userProfile")
    Set<Place> places;

    //set of Bookings

}
