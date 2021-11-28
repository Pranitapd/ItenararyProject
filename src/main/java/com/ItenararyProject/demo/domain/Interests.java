package com.ItenararyProject.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Interests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String interest;
    private String description;

    //many to many with user
    @ManyToMany
    @JoinTable(name = "user_interests",
                joinColumns = @JoinColumn(name = "userId")
                ,inverseJoinColumns = @JoinColumn(name = "interestId"))
    Set<UserProfile> userProfiles;
}
