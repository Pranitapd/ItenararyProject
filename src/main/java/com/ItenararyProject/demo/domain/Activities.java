package com.ItenararyProject.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Activities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String description;
    private int entry_charges;
    private int distFrmHtl;

    @ManyToOne
    private Place place;
    //save place id for each activity

}
