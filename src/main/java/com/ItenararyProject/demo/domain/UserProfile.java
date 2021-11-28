package com.ItenararyProject.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String password;
    private String name;
    private String emailId;
    private int phoneNumber;

    @ManyToMany(mappedBy = "userProfiles")
    private Set<Interests> interests = new HashSet<>(); ;

    @OneToMany(mappedBy = "userProfile")   //inverse side
    private Set<Reviews> reviews = new HashSet<>();

    @OneToMany(mappedBy = "userProfile")
    Set<Place> places;

    //set of Bookings

    public UserProfile addReview(Reviews reviews)
    {
        reviews.setUserProfile(this);
        this.getReviews().add(reviews);
        return this;
    }

}
