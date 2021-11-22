package com.ItenararyProject.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToOne //This creates bi directional
    private UserProfile userProfile;

    @OneToMany(mappedBy = "place")
    Set<Attractions> attractions;

    @OneToMany(mappedBy = "place")
    Set<Activities> activities;

    @OneToMany(mappedBy = "place")
    Set<Reviews> reviews;
    //set of hotels
}
