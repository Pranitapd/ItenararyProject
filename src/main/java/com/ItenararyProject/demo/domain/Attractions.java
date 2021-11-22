package com.ItenararyProject.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Attractions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private int distFrmHtl;
    private int entryCharges;

    @ManyToOne
    private Place place;
    //save place_id for each attraction

}
